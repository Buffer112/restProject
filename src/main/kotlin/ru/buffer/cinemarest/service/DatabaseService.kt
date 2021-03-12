package ru.buffer.cinemarest.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringBootConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.RowMapper
import org.springframework.stereotype.Service
import ru.buffer.cinemarest.models.Cinema
import ru.buffer.cinemarest.models.Hall
import ru.buffer.cinemarest.models.Place
import java.sql.ResultSet

@Service
class DatabaseService(val jdbc: JdbcTemplate) : CommandLineRunner {
    fun queryGetAllCinema(): List<Cinema> {
        val rowAllCinema: RowMapper<Cinema> = RowMapper<Cinema> { rs: ResultSet, rowNum: Int ->
            Cinema(rs.getInt("id"),
                rs.getString("name"))
        }
        return jdbc.query("SELECT * FROM cinema_table", rowAllCinema)
    }
    fun queryGetAllHalls(id: Int): List<Hall> {
        val rowAllHalls: RowMapper<Hall> = RowMapper<Hall> { rs: ResultSet, rowNum: Int ->
            Hall(rs.getInt("id"),
                rs.getString("name"),
                rs.getInt("cinema_id"))
        }
        return jdbc.query("SELECT * FROM hall_table where cinema_id=${id}", rowAllHalls)
    }
    fun queryGetAllPlace(id: Int): List<Place> {
        val rowAllPlace: RowMapper<Place> = RowMapper<Place> { rs: ResultSet, rowNum: Int ->
            Place(rs.getInt("num"),
                rs.getInt("hall_id"),
                rs.getBoolean("occupied"))
        }
        return jdbc.query("SELECT * FROM place_table where hall_id=${id}", rowAllPlace)
    }
    fun querySetPlace(id: Int, num: Int) : Int{
        return jdbc.update("update place_table set occupied=TRUE where (hall_id =${id} and num=${num})")
    }
    override fun run(vararg args: String?) {
        //jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS kek(id INT, name VARCHAR(50))")
        //queryGetAllCinema().forEach{rec -> println(rec)}
    }
}