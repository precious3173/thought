package com.example.thought.datasource.mocksource//package com.example.thought.datasource.mocksource
//
//import org.assertj.core.api.Assertions.assertThat
//import org.junit.jupiter.api.Test
//
//internal class MockBankDataSourceTest{
//
//    private val mockDataSource = MockBankDataSource()
//    @Test
//    fun shouldNotBeEmpty(){
//
//
//        val banks = mockDataSource.getBank()
//
//        assertThat(banks).isNotEmpty()
//    }
//
//    @Test
//    fun shouldProvideMockData(){
//  val  banks = mockDataSource.getBank()
//        assertThat(banks).allMatch{it.accountNumber.isNotBlank()}
//
//    }
//}