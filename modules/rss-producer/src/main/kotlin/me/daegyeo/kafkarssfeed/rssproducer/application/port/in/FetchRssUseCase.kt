package me.daegyeo.kafkarssfeed.rssproducer.application.port.`in`

fun interface FetchRssUseCase {
    fun fetchRss(url: String)
}
