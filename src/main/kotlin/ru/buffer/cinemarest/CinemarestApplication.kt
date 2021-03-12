package ru.buffer.cinemarest

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.RowMapper
import ru.buffer.cinemarest.models.Cinema
import ru.buffer.cinemarest.models.Hall
import java.sql.DriverManager
import java.sql.ResultSet

@SpringBootApplication
class CinemarestApplication

fun main(args: Array<String>) {
    runApplication<CinemarestApplication>(*args)
}
