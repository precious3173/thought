package com.example.thought.controllers

import com.example.thought.model.Bank
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class FinancialInstitutionController {

    @PostMapping("/institution")
    fun createBanks(@RequestBody bank: Bank) : ResponseEntity<Bank> {
        val createdBank =service.createBank(bank)
        return ResponseEntity(createdBank, HttpStatus.CREATED)
    }
}