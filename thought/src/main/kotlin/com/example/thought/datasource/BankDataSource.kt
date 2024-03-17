package com.example.thought.datasource

import com.example.thought.model.Bank

interface BankDataSource{

fun getBank(): Collection<Bank>
}