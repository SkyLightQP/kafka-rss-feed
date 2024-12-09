package me.daegyeo.kafkarssfeed.consumer.application.service

import me.daegyeo.kafkarssfeed.consumer.application.port.`in`.SaveManyRssArticleUseCase
import me.daegyeo.kafkarssfeed.consumer.application.port.out.SaveRssArticlePort
import me.daegyeo.kafkarssfeed.rssproducer.application.domain.RssArticle
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class SaveManyRssArticleService(private val saveRssArticlePort: SaveRssArticlePort) : SaveManyRssArticleUseCase {

    override fun saveManyRssArticle(article: List<RssArticle>) {
        article.forEach { saveRssArticlePort.saveRssArticle(it) }
    }
}