package com.example.thought

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ThoughtApplication

fun main(args: Array<String>) {
	runApplication<ThoughtApplication>(*args)
}
