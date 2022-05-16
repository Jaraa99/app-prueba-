package com.example.academico.controller

import com.example.academico.model.Student
import com.example.academico.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/test")
class `Student control`  {
    @Autowired
    lateinit var studentService: StudentService

    @GetMapping
    fun list():List<Student> {
        return studentService.list()
    }
    @PostMapping
    fun save(@RequestBody student:Student):Student {
    return studentService.save(student)
    }

}
