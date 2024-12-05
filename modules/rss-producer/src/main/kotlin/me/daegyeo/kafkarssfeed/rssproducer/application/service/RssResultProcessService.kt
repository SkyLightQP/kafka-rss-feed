package me.daegyeo.kafkarssfeed.rssproducer.application.service

import me.daegyeo.kafkarssfeed.rssproducer.application.domain.RssArticle
import me.daegyeo.kafkarssfeed.rssproducer.application.port.`in`.RssResultProcessUseCase
import me.daegyeo.kafkarssfeed.rssproducer.application.port.out.KafkaProducerPort
import me.daegyeo.kafkarssfeed.rssproducer.constant.Topic
import org.springframework.stereotype.Service

@Service
class RssResultProcessService(private val kafkaProducerPort: KafkaProducerPort) : RssResultProcessUseCase {
    override fun process(data: List<RssArticle>) {
        data.forEach {
            kafkaProducerPort.send(Topic.RSS.topic, it)
        }
    }
}