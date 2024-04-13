package com.example.thought.DTO

data class BankDTO(

        val accountNumber: String? = null,
        val name: String? = null,
        val transactionFee: Int? = null,
        val institutionId: Long = 0
)
