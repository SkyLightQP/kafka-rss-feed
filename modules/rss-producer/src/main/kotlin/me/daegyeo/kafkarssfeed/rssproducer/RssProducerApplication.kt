package me.daegyeo.kafkarssfeed.rssproducer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@EnableScheduling
@SpringBootApplication
class RssProducerApplication

fun main(args: Array<String>) {
    runApplication<RssProducerApplication>(*args)
}
