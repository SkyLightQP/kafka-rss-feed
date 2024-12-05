package me.daegyeo.kafkarssfeed.consumer.adapter.`in`

import me.daegyeo.kafkarssfeed.rssproducer.application.domain.RssArticle
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class RssTopicListener {

    @KafkaListener(topics = ["kafka-rss-feed.rss"], groupId = "rss-feed-consumer-group")
    fun listen(message: RssArticle) {
        println("Received Message: $message")
    }
}