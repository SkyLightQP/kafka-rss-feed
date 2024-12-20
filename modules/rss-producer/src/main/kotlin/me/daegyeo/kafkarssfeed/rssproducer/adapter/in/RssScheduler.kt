package me.daegyeo.kafkarssfeed.rssproducer.adapter.`in`

import me.daegyeo.kafkarssfeed.rssproducer.application.port.`in`.FetchRssUseCase
import me.daegyeo.kafkarssfeed.rssproducer.application.port.`in`.RssResultProcessUseCase
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component


@Component
class RssScheduler(
    private val fetchRssUseCase: FetchRssUseCase,
    private val rssResultProcessUseCase: RssResultProcessUseCase
) {
    val RSS_URL = "https://www.korea.kr/rss/policy.xml"

    @Scheduled(cron = "0 0 0/1 * * ?")
    fun fetchRss() {
        val result = fetchRssUseCase.fetchRss(RSS_URL)
        rssResultProcessUseCase.process(result)
    }
}