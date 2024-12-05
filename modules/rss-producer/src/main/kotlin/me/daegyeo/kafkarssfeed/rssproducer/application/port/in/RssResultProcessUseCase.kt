package me.daegyeo.kafkarssfeed.rssproducer.application.port.`in`

import me.daegyeo.kafkarssfeed.rssproducer.application.domain.RssArticle

fun interface RssResultProcessUseCase {
    fun process(data: List<RssArticle>)
}