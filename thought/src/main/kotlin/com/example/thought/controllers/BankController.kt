package com.example.thought.controllers

import com.example.thought.datasource.services.BankService
import com.example.thought.model.Bank
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/banks")
class BankController(private val service: BankService) {
    @GetMapping
    fun myBanks() : Collection<Bank> = service.getBanks()
}