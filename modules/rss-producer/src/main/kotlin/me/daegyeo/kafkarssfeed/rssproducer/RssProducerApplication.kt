package me.daegyeo.kafkarssfeed.rssproducer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RssProducerApplication

fun main(args: Array<String>) {
    runApplication<RssProducerApplication>(*args)
}
