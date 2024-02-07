package com.assistants

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class AssistantsApplication

fun main(args: Array<String>) {
    runApplication<AssistantsApplication>(*args)
}