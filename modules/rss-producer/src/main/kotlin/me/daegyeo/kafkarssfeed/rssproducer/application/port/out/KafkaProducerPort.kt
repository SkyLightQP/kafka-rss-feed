package me.daegyeo.kafkarssfeed.rssproducer.application.port.out

fun interface KafkaProducerPort {
    fun send(topic: String, message: Any)
}