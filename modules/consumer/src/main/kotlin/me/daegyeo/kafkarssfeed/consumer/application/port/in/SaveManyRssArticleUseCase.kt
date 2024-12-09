package me.daegyeo.kafkarssfeed.consumer.application.port.`in`

import me.daegyeo.kafkarssfeed.rssproducer.application.domain.RssArticle

fun interface SaveManyRssArticleUseCase {

    fun saveManyRssArticle(article: List<RssArticle>)
}