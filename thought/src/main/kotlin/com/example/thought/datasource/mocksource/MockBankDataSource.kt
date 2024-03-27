package com.example.thought.datasource.mocksource

import com.example.thought.datasource.BankDataSource
import com.example.thought.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource: BankDataSource{
    override fun getBank(): Collection<Bank> {
        return listOf(Bank(1,"1234", "Precious",2000),
                Bank(2, "1244", "Thanni", 1000))
    }
}