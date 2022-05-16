package com.example.academico.controller


import com.example.academico.model.Director
import com.example.academico.model.Student
import com.example.academico.service.DirectorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/test")
class `Director control` {
    @Autowired
    lateinit var directorService: DirectorService

    @GetMapping
    fun list():List<Director> {
        return directorService.list()
    }

    @PostMapping
    fun save(@RequestBody director: Director): Director {
        return directorService.save(director)
    }
}