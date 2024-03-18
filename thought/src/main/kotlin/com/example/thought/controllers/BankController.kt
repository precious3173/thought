package com.example.thought.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/banks")
class BankController {
    @GetMapping
    fun myBanks() = listOf<String>(
            "first bank",
            "Central bank",
            "Wema bank"
    )
}