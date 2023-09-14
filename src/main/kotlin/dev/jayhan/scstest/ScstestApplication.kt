package dev.jayhan.scstest

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.function.Consumer
import java.util.function.Supplier

@SpringBootApplication
class ScstestApplication

fun main(args: Array<String>) {
    runApplication<ScstestApplication>(*args)
}

@Configuration
class A {
    private val logger = LoggerFactory.getLogger(this::class.java)

    @Bean
    fun myconsumer(): Consumer<String> {
        return Consumer { str ->
            logger.info(str)
        }
    }

    @Bean
    fun myproducer(): Supplier<String> {
        return Supplier {

        }
    }
}
