package me.daegyeo.kafkarssfeed.consumer.application.persistence

import jakarta.persistence.*
import java.time.ZonedDateTime


@Entity
@Table(name = "rss_articles")
class RssArticleEntity(
    title: String,
    link: String,
    description: String,
    date: ZonedDateTime
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    @Column(nullable = false)
    var title: String = title

    @Column(nullable = false)
    var link: String = link

    @Column(nullable = false)
    var description: String = description

    @Column(nullable = false)
    var date: ZonedDateTime = date
}