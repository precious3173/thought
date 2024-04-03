package com.example.thought.datasource

import com.example.thought.model.Bank
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface BankDataSource: JpaRepository<Bank, Long>{
    @Query(value = "SELECT * FROM banks", nativeQuery = true)
    fun getBank(): List<Bank>
}