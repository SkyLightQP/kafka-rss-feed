package me.daegyeo.kafkarssfeed.consumer.adapter.`in`.web

import me.daegyeo.kafkarssfeed.consumer.application.port.`in`.ReadAllRssArticleUseCase
import me.daegyeo.kafkarssfeed.rssproducer.application.domain.RssArticle
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Controller
@RestController
@RequestMapping("/rss")
class RssFeedController(private val readAllRssArticleUseCase: ReadAllRssArticleUseCase) {

    @GetMapping
    fun getRssFeed(): List<RssArticle> {
        return readAllRssArticleUseCase.readAllRssArticle()
    }
}