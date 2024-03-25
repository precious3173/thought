package com.example.thought.model

import jakarta.persistence.*

@Entity
@Table
data class Bank(
        @Id
        @SequenceGenerator(
         name = "bank_sequence",
         sequenceName = "bank_sequence",
         allocationSize = 1
        )
        @GeneratedValue(
                strategy = GenerationType.SEQUENCE,
                generator = "banks"
        )
        val id: Long,
        val accountNumber: String,
        val name: String,
        val transactionFee: Int
        )