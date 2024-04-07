package com.example.thought.datasource.services

import com.example.thought.datasource.BankDataSource
import com.example.thought.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(val bankDataSource: BankDataSource) {
    fun getBanks(): List<Bank> {
        return bankDataSource.findAll()
    }

    fun createBank(bank: Bank): Bank{
        return bankDataSource.save(bank)
    }
    fun getBankById(id: Long): Bank? {
        return bankDataSource.findById(id).orElse(null)
    }

    fun updateBank(id: Long, updatedBank: Bank): Bank? {
        if (bankDataSource.existsById(id)) {
            updatedBank.id = id
            return bankDataSource.save(updatedBank)
        }
        return null
    }

    fun deleteBank(id: Long) {
        bankDataSource.deleteById(id)
    }
    fun findByAccountNumber (accountNumber: String) :List<Bank>{
        return bankDataSource.findByAccountNumber(accountNumber)!!
    }
}