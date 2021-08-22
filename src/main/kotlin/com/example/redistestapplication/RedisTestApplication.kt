package com.example.redistestapplication

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RedisTestApplication

fun main(args: Array<String>) {
    runApplication<RedisTestApplication>(*args)
}
