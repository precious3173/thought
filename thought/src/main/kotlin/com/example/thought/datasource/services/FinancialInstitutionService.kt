package com.example.thought.datasource.services

import com.example.thought.model.Bank
import com.example.thought.model.FinancialInstitution
import org.springframework.stereotype.Service

@Service
class FinancialInstitutionService(val financialInstitutionResource: FinancialInstitutionResource) {

    fun createInstitution(financialInstitution: FinancialInstitution): FinancialInstitution {
        return financialInstitutionResource.save(financialInstitution)
    }

    fun getInstitution(): List<FinancialInstitution> {
        return financialInstitutionResource.findAll()
    }
}