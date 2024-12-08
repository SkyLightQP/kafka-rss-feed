package me.daegyeo.kafkarssfeed.consumer.adapter.out.persistence

import me.daegyeo.kafkarssfeed.consumer.application.persistence.RssArticleEntity
import me.daegyeo.kafkarssfeed.consumer.application.port.out.SaveRssArticlePort
import me.daegyeo.kafkarssfeed.rssproducer.application.domain.RssArticle
import org.springframework.stereotype.Component

@Component
class RssArticlePersistenceAdapter(
    private val rssArticleRepository: RssArticleRepository
) : SaveRssArticlePort {
    
    override fun saveRssArticle(article: RssArticle) {
        val entity = RssArticleEntity(
            title = article.title,
            link = article.link,
            description = article.description,
            date = article.date
        )

        rssArticleRepository.save(entity)
    }
}