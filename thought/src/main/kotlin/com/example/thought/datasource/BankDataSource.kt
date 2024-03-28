package com.example.thought.datasource

import com.example.thought.model.Bank
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BankDataSource: JpaRepository<Bank, Long>{

fun getBank(): Collection<Bank>
}