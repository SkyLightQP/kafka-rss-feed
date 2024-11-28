package me.daegyeo.kafkarssfeed

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaRssFeedApplication

fun main(args: Array<String>) {
    runApplication<KafkaRssFeedApplication>(*args)
}
