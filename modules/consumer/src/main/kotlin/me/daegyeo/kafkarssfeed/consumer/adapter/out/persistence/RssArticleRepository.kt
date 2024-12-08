package me.daegyeo.kafkarssfeed.consumer.adapter.out.persistence

import me.daegyeo.kafkarssfeed.consumer.application.persistence.RssArticleEntity
import org.springframework.data.jpa.repository.JpaRepository


interface RssArticleRepository : JpaRepository<RssArticleEntity, Long> {
}