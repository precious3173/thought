package com.example.thought.datasource.services

import com.example.thought.datasource.BankDataSource
import com.example.thought.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(val bankDataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> {
        return bankDataSource.getBank()
    }
}