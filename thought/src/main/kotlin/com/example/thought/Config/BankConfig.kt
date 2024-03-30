package com.example.thought.Config

import com.example.thought.datasource.BankDataSource
import com.example.thought.datasource.mocksource.MockBankDataSource
import com.example.thought.model.Bank
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BankConfig {

    @Bean
    fun commandLineRunner(bankDataSource: BankDataSource): CommandLineRunner{
        return CommandLineRunner { args ->

           val accessBank = Bank(1, "1244", "Thanni", 1000)
            val fidelityBank = Bank(2, "1244", "Thanni", 1000)

            bankDataSource.saveAll(
                    listOf(accessBank, fidelityBank))
        }


    }
}