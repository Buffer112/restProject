package ru.buffer.cinemarest.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.RowMapper
import org.springframework.web.bind.annotation.*
import ru.buffer.cinemarest.models.Cinema
import ru.buffer.cinemarest.models.Hall
import ru.buffer.cinemarest.models.Place
import ru.buffer.cinemarest.service.DatabaseService
import java.sql.ResultSet

@RestController
@RequestMapping("/cinema")
class CinemaRestController(@Autowired val jdbcTemplate: JdbcTemplate) : DatabaseService(jdbcTemplate){
    @GetMapping
    fun getAllCinema() : List<Cinema>{
        return queryGetAllCinema()
    }
    @GetMapping("/{cinemaId}")
    fun getAllHalls(@PathVariable cinemaId : Int) : List<Hall>{
        return queryGetAllHalls(cinemaId)
    }
    @GetMapping("/place/{hallId}")
    fun getAllPlace(@PathVariable hallId : Int) : List<Place>{
        return queryGetAllPlace(hallId)
    }
    @PutMapping("/place/{hallId}/{listNum}")
    fun putOccupSpace(@PathVariable hallId: Int,
                      @PathVariable listNum : Int): String{
        var result = querySetPlace(hallId, listNum)
        return "${result} place occupied!"
    }
    override fun run(vararg args: String?) {

    }
}
