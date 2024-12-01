package me.daegyeo.kafkarssfeed.rssproducer.adapter.out

import me.daegyeo.kafkarssfeed.rssproducer.application.port.out.KafkaProducerPort
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class KafkaProducerAdapter(
    private val kafkaTemplate: KafkaTemplate<String, Any>
) : KafkaProducerPort {
    override fun send(topic: String, message: Any) {
        kafkaTemplate.send(topic, message)
    }
}