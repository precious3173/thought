package com.example.thought.Config

import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BankConfig {

    @Bean
    fun commandLineRunner(): CommandLineRunner{
        return CommandLineRunner { args ->


        }
    }
}