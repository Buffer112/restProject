package ru.buffer.cinemarest.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.RowMapper
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RestController
import ru.buffer.cinemarest.models.Cinema
import ru.buffer.cinemarest.models.Hall
import ru.buffer.cinemarest.models.Place
import ru.buffer.cinemarest.service.DatabaseService
import java.sql.ResultSet

@RestController("/cinema")
class CinemaRestController(@Autowired val jdbcTemplate: JdbcTemplate) : DatabaseService(jdbcTemplate) {
    /**
     * getAllCinema - возвращает все кинотеатры
     * getAllHalls - возвращает все доступные кинозалы в кинотеатре по cinemaId
     * getAllPlace - возвращает все места из зала по hallId
     * putOccupSpace - бронирует место
     */
    @GetMapping("")
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
    @PutMapping("/place/{hallId}{listNum}")
    fun putOccupSpace(@PathVariable hallId: Int,
                      @PathVariable listNum : Int){
        querySetPlace(hallId, listNum)
    }

    override fun run(vararg args: String?) {

    }
}