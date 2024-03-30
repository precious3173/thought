package com.example.thought.datasource.mocksource

import com.example.thought.datasource.BankDataSource
import com.example.thought.model.Bank
import org.springframework.data.domain.Example
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.repository.query.FluentQuery
import org.springframework.stereotype.Repository
import java.util.*
import java.util.function.Function


class MockBankDataSource: BankDataSource{
    override fun getBank(): Collection<Bank> {
        return listOf(Bank(1,"1234", "Precious",2000),
                Bank(2, "1244", "Thanni", 1000))
    }

    override fun <S : Bank?> save(entity: S): S {
        TODO("Not yet implemented")
    }

    override fun <S : Bank?> saveAll(entities: MutableIterable<S>): MutableList<S> {
        TODO("Not yet implemented")
    }

    override fun <S : Bank?> findAll(example: Example<S>): MutableList<S> {
        TODO("Not yet implemented")
    }

    override fun <S : Bank?> findAll(example: Example<S>, sort: Sort): MutableList<S> {
        TODO("Not yet implemented")
    }

    override fun findAll(): MutableList<Bank> {
        TODO("Not yet implemented")
    }

    override fun findAll(sort: Sort): MutableList<Bank> {
        TODO("Not yet implemented")
    }

    override fun findAll(pageable: Pageable): Page<Bank> {
        TODO("Not yet implemented")
    }

    override fun <S : Bank?> findAll(example: Example<S>, pageable: Pageable): Page<S> {
        TODO("Not yet implemented")
    }

    override fun findAllById(ids: MutableIterable<Long>): MutableList<Bank> {
        TODO("Not yet implemented")
    }

    override fun count(): Long {
        TODO("Not yet implemented")
    }

    override fun <S : Bank?> count(example: Example<S>): Long {
        TODO("Not yet implemented")
    }

    override fun delete(entity: Bank) {
        TODO("Not yet implemented")
    }

    override fun deleteAllById(ids: MutableIterable<Long>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll(entities: MutableIterable<Bank>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll() {
        TODO("Not yet implemented")
    }

    override fun <S : Bank?> findOne(example: Example<S>): Optional<S> {
        TODO("Not yet implemented")
    }

    override fun <S : Bank?> exists(example: Example<S>): Boolean {
        TODO("Not yet implemented")
    }

    override fun <S : Bank?, R : Any?> findBy(example: Example<S>, queryFunction: Function<FluentQuery.FetchableFluentQuery<S>, R>): R {
        TODO("Not yet implemented")
    }

    override fun flush() {
        TODO("Not yet implemented")
    }

    override fun <S : Bank?> saveAndFlush(entity: S): S {
        TODO("Not yet implemented")
    }

    override fun <S : Bank?> saveAllAndFlush(entities: MutableIterable<S>): MutableList<S> {
        TODO("Not yet implemented")
    }

    override fun deleteAllInBatch(entities: MutableIterable<Bank>) {
        TODO("Not yet implemented")
    }

    override fun deleteAllInBatch() {
        TODO("Not yet implemented")
    }

    override fun deleteAllByIdInBatch(ids: MutableIterable<Long>) {
        TODO("Not yet implemented")
    }

    override fun getReferenceById(id: Long): Bank {
        TODO("Not yet implemented")
    }

    override fun getById(id: Long): Bank {
        TODO("Not yet implemented")
    }

    override fun getOne(id: Long): Bank {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: Long) {
        TODO("Not yet implemented")
    }

    override fun existsById(id: Long): Boolean {
        TODO("Not yet implemented")
    }

    override fun findById(id: Long): Optional<Bank> {
        TODO("Not yet implemented")
    }
}