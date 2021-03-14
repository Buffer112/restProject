package ru.buffer.cinemarest.service

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.transaction.annotation.Transactional

@SpringBootTest
internal class DatabaseServiceTest(@Autowired val dataService: DatabaseService) {

    @Test
    fun queryGetAllCinema() {
        if (dataService.queryGetAllCinema().isEmpty()){
            println("Test complite")
        }
        else{
            println("Test not complite!")
        }
    }

    @Test
    fun queryGetAllHalls() {
        if (dataService.queryGetAllHalls(0).isEmpty()) {
            println("Test complite")
        }
        else{
            println("Test not complite!")
        }
    }

    @Test
    fun queryGetAllPlace() {
        if (dataService.queryGetAllPlace(0).isEmpty()) {
            println("Test complite")
        }
        else{
            println("Test not complite!")
        }
    }

    @Test
    fun querySetPlace() {
        if (dataService.querySetPlace(0, 0) != 1){
            println("Test complite")
        }
        else{
            println("Test not complite!")
        }
    }
}