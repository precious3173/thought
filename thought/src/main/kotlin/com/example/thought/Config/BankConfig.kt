package com.example.thought.Config

import com.example.thought.datasource.BankDataSource
import com.example.thought.model.Bank
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BankConfig {

    @Bean
    fun commandLineRunner(bankDataSource: BankDataSource): CommandLineRunner{
        return CommandLineRunner { args ->

           val accessBank = Bank( accountNumber = "1244", name = "Thanni", transactionFee = 1000)
            val fidelityBank = Bank(accountNumber = "1234", name = "Omotayo", transactionFee = 2000)
            val solBank = Bank(accountNumber = "12114", name = "Omot1yo", transactionFee = 3000)

            bankDataSource.saveAll(
                    listOf(accessBank, fidelityBank))
        }


    }
}