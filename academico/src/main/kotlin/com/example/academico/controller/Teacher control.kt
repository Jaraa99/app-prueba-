package com.example.academico.controller


import com.example.academico.model.Student
import com.example.academico.model.Teacher
import com.example.academico.service.TeacherService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/test")
class `Teacher control` {
    @Autowired
    lateinit var teacherService: TeacherService

    @GetMapping
    fun list():List<Teacher> {
        return teacherService.list()
    }

    @PostMapping
    fun save(@RequestBody teacher: Teacher): Teacher {
        return teacherService.save(teacher)
    }
}