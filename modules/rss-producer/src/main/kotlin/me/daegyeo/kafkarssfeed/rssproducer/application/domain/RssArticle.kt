package me.daegyeo.kafkarssfeed.rssproducer.application.domain

data class RssArticle(
    val title: String,
    val link: String,
    val description: String,
    val date: String
)
