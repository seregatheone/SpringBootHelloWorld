package com.example.helloworldapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloWorldAppApplication

fun main(args: Array<String>) {
    runApplication<HelloWorldAppApplication>(*args)
}
