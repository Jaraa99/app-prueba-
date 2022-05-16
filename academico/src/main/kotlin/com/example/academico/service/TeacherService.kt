package com.example.academico.service

import com.example.academico.model.Director
import com.example.academico.model.Teacher
import com.example.academico.repository.TeacherRepository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class TeacherService {


    @Autowired
    lateinit var teacherRepository: TeacherRepository
    fun list():List<Teacher> {
        return  teacherRepository.findAll()

    }
    fun save(teacher: Teacher): Teacher {
        return teacherRepository.save(teacher)
    }
}