package ru.buffer.cinemarest

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.runApplication
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.context.junit4.SpringRunner
import ru.buffer.cinemarest.controllers.CinemaRestController


@SpringBootTest
class CinemarestApplicationTests{
    @Test
    fun contextLoads(){
    }
}

//fun main(args: Array<String>) {
//
//}