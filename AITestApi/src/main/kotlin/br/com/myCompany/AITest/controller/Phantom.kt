package br.com.myCompany.AITest.controller

import io.github.oshai.kotlinlogging.KotlinLogging
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1")
class Phantom {

    private val logger = KotlinLogging.logger {}

    @GetMapping("/products")
    fun getProducts() {
        logger.info { "Passou aqui!" }
    }
}