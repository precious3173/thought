package com.example.thought.datasource.mock

import com.example.thought.datasource.BankDataSource
import com.example.thought.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource: BankDataSource{
    override fun getBank(): Collection<Bank> {
        return listOf(Bank("1234", 0.0, 0))
    }
}