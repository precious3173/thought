package com.example.thought.model

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.NoArgsConstructor

@Entity
@Table()
@AllArgsConstructor
@NoArgsConstructor
data class Bank(
        @Id
        @SequenceGenerator(
         name = "bank_sequence",
         sequenceName = "bank_sequence",
         allocationSize = 1
        )
        @GeneratedValue(
                strategy = GenerationType.SEQUENCE,
                generator = "bank_sequence"
        )
        var id: Long = 0,
        val accountNumber: String? = null,
        val name: String? = null,
        val transactionFee: Int? = null
        )