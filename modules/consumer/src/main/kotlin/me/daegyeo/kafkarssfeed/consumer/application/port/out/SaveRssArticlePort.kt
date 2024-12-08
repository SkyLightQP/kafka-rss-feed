package me.daegyeo.kafkarssfeed.consumer.application.port.out

import me.daegyeo.kafkarssfeed.rssproducer.application.domain.RssArticle

fun interface SaveRssArticlePort {
    fun saveRssArticle(article: RssArticle)
}