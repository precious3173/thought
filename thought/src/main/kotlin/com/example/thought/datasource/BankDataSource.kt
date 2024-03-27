package com.example.thought.datasource

import com.example.thought.model.Bank
import org.springframework.data.jpa.repository.JpaRepository

interface BankDataSource{

fun getBank(): Collection<Bank>
}