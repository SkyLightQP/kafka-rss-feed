package me.daegyeo.kafkarssfeed.application.domain

data class RssArticle(
    val title: String,
    val link: String,
    val description: String,
    val date: String
)
