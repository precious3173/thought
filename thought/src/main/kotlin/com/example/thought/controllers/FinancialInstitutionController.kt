package com.example.thought.controllers

import com.example.thought.datasource.services.FinancialInstitutionService
import com.example.thought.model.Bank
import com.example.thought.model.FinancialInstitution
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class FinancialInstitutionController(val financialInstitutionService: FinancialInstitutionService) {

    @PostMapping("/institution")
    fun createInstitution(@RequestBody institution: FinancialInstitution) : ResponseEntity<FinancialInstitution> {
        val createdInstitution =financialInstitutionService.createInstitution(institution)
        return ResponseEntity(createdInstitution, HttpStatus.CREATED)
    }

    @GetMapping("/getInstitution")
    @ResponseStatus(HttpStatus.OK)
    fun getInstitution() : ResponseEntity<List<FinancialInstitution>> {
        val institution = financialInstitutionService.getInstitution()

        return ResponseEntity(institution, HttpStatus.OK)
    }
}