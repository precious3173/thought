package com.example.thought.datasource.services

import com.example.thought.model.FinancialInstitution
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FinancialInstitutionResource: JpaRepository<FinancialInstitution, Long> {
}