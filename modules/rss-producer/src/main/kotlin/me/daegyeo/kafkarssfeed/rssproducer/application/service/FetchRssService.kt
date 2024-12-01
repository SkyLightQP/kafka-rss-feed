package me.daegyeo.kafkarssfeed.rssproducer.application.service

import me.daegyeo.kafkarssfeed.rssproducer.application.port.`in`.FetchRssUseCase
import org.springframework.stereotype.Service

@Service
class FetchRssService : FetchRssUseCase {
    override fun fetchRss(link: String) {
        // TODO
    }
}