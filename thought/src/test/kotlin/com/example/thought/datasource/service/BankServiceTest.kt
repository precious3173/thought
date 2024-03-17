package com.example.thought.datasource.service

import com.example.thought.datasource.BankDataSource
import com.example.thought.datasource.mock.MockBankDataSource
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BankServiceTest{
   private val dataSource: BankDataSource= mockk(relaxed = true)

   private val bankService = BankService(bankDataSource = dataSource)

    @Test
    fun callDataSource(){

        every { dataSource.getBank() } returns emptyList()
      val banks = bankService.getBanks()

        verify (exactly = 1){ dataSource.getBank() }
    }
}