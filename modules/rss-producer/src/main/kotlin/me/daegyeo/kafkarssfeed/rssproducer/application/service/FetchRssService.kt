package me.daegyeo.kafkarssfeed.rssproducer.application.service

import me.daegyeo.kafkarssfeed.rssproducer.application.domain.RssArticle
import me.daegyeo.kafkarssfeed.rssproducer.application.port.`in`.FetchRssUseCase
import org.jsoup.Jsoup
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

@Service
class FetchRssService : FetchRssUseCase {
    override fun fetchRss(url: String): List<RssArticle> {
        val res = Jsoup.connect(url).get()
        val feed = res.select("channel > item")
        return feed.map {
            val title = it.select("title").text()
            val link = it.select("link").text()
            val description = it.select("description").text()
            val rawDate = it.select("pubDate").text()
            val date = LocalDateTime.parse(rawDate, DateTimeFormatter.RFC_1123_DATE_TIME).atZone(ZoneId.of("GMT"))

            makeRssArticle(title, link, description, date)
        }
    }

    private fun makeRssArticle(title: String, link: String, description: String, date: ZonedDateTime): RssArticle {
        return RssArticle(
            title = title,
            link = link,
            description = description,
            date = date
        )
    }
}