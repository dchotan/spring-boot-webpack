package com.patrickgrimard

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

/**
 *
 *
 * Created on 2016-03-24
 *
 * @author Patrick
 */
@SpringBootApplication
open class Application {

    @Bean
    open fun messageService() : MessageService {
        return KotlinMessageService()
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}