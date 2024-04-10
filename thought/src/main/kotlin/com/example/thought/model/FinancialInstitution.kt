package com.example.thought.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class FinancialInstitution(
        @GeneratedValue(strategy =GenerationType.IDENTITY)
        @Id
     val id: Long = 0,
     val instituteName:String? = null

)
