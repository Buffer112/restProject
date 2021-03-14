package ru.buffer.cinemarest.controllers

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc

@SpringBootTest
internal class CinemaRestControllerTest(@Autowired val controller : CinemaRestController) {

    @Test
    fun getAllCinema() {
        if (controller.getAllCinema().isEmpty()){
            println("Test complite")
        }
        else{
            println("Test not complite!")
        }
    }

    @Test
    fun getAllHalls() {
        if (controller.getAllHalls(0).isEmpty()) {
            println("Test complite")
        }
        else{
            println("Test not complite!")
        }
    }

    @Test
    fun getAllPlace() {
        if (controller.getAllPlace(0).isEmpty()){
            println("Test complite")
        }
        else{
            println("Test not complite!")
        }
    }

    @Test
    fun putOccupSpace() {
        if (controller.putOccupSpace(0, 0).isEmpty()){
            println("Test complite")
        }
        else{
            println("Test not complite!")
        }
    }
}