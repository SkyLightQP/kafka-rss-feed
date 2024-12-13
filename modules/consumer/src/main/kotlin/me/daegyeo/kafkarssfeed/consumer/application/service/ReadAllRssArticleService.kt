package me.daegyeo.kafkarssfeed.consumer.application.service

import me.daegyeo.kafkarssfeed.consumer.application.port.`in`.ReadAllRssArticleUseCase
import me.daegyeo.kafkarssfeed.consumer.application.port.out.ReadAllRssArticlePort
import me.daegyeo.kafkarssfeed.rssproducer.application.domain.RssArticle
import org.springframework.stereotype.Service

@Service
class ReadAllRssArticleService(private val readAllRssArticlePort: ReadAllRssArticlePort) : ReadAllRssArticleUseCase {

    override fun readAllRssArticle(): List<RssArticle> {
        return readAllRssArticlePort.readAllRssArticle()
    }
}