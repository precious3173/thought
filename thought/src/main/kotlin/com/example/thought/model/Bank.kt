package com.example.thought.model

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.NoArgsConstructor

@Entity
@Table(name="bank")
@AllArgsConstructor
@NoArgsConstructor
data class Bank(
        @GeneratedValue(
                strategy = GenerationType.IDENTITY
        )
        @Id
        var id: Long = 0,
        @Column(unique = true)
        val accountNumber: String? = null,
        val name: String? = null,
        val transactionFee: Int? = null,

        @OneToOne(
               mappedBy = "bank",
                cascade = arrayOf(CascadeType.ALL)
        )
        val bankProfile: BankProfile? = null,

        @ManyToOne
        @JoinColumn(
                name = "bank_id"
        )
        val institution: FinancialInstitution? = null

         )