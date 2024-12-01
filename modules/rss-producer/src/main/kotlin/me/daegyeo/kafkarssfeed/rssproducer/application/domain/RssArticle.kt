package me.daegyeo.kafkarssfeed.rssproducer.application.domain

import java.time.ZonedDateTime

data class RssArticle(
    val title: String,
    val link: String,
    val description: String,
    val date: ZonedDateTime
)
