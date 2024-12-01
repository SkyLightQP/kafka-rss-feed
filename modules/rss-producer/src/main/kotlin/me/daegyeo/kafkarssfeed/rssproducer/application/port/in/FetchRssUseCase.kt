package me.daegyeo.kafkarssfeed.rssproducer.application.port.`in`

import me.daegyeo.kafkarssfeed.rssproducer.application.domain.RssArticle

fun interface FetchRssUseCase {
    fun fetchRss(url: String): List<RssArticle>
}
