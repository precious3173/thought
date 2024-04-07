package com.example.thought.controllers

import com.example.thought.datasource.BankDataSource
import com.example.thought.datasource.services.BankService
import com.example.thought.model.Bank
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/banks")
class BankController(private val service: BankService) {
    @GetMapping ("/getbanks")
    @ResponseStatus(HttpStatus.OK)
    fun getBanks() : ResponseEntity<List<Bank>> {
        val banks = service.getBanks()

        return ResponseEntity(banks, HttpStatus.OK)
    }

    @PostMapping("/banks")
    fun createBanks(@RequestBody bank: Bank) : ResponseEntity<Bank>{
        val createdBank =service.createBank(bank)
        return ResponseEntity(createdBank, HttpStatus.CREATED)
    }
    @GetMapping("/search/{id}")
    fun getUserById(@PathVariable id: Long): ResponseEntity<Bank?>{

        val bank = service.getBankById(id)

        return if (bank !=null){
            ResponseEntity(bank, HttpStatus.OK)
        }
        else{
            ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }

    @GetMapping("/getBanks/search/{account-number}")
    fun findByAccountNumber (@PathVariable("account-number") accountNumber: String): ResponseEntity<List<Bank?>>{

        val accountName = service.findByAccountNumber(accountNumber)

        return if (accountName !=null){
            ResponseEntity(accountName, HttpStatus.OK)
        }
        else{
            ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }
    @PutMapping("/{id}")
    fun updateBank(@PathVariable id: Long, @RequestBody updatedBank: Bank): ResponseEntity<Bank?>{
        val bank = service.updateBank(id, updatedBank)
        return if (bank != null){
            ResponseEntity(bank, HttpStatus.OK)
        }
        else{
            ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }


    @DeleteMapping("/{id}")
    fun deleteBank(@PathVariable id: Long): ResponseEntity<Void> {
        service.deleteBank(id)
        return ResponseEntity(HttpStatus.NO_CONTENT)
    }
}