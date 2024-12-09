package me.daegyeo.kafkarssfeed.consumer.application.persistence

import jakarta.persistence.*
import java.time.ZonedDateTime


@Entity
@Table(name = "rss_articles")
class RssArticleEntity(
    @Column(nullable = false)
    val title: String,

    @Column(nullable = false)
    val link: String,

    @Column(nullable = false)
    val description: String,

    @Column(nullable = false)
    val date: ZonedDateTime,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
)