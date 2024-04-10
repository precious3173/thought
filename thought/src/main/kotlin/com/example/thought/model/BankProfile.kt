package com.example.thought.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToOne

@Entity
data class BankProfile(

        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id
        val id: Long = 0,
        val bankBio: String? = null,
        @OneToOne
        @JoinColumn(
                name = "bank_id"
        )
        val bank: Bank? = null
)
