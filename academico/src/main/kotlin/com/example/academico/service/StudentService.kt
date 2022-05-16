package com.example.academico.service

import com.example.academico.model.Student
import com.example.academico.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class StudentService {


    @Autowired
    lateinit var studentRepository: StudentRepository
    fun list():List<Student> {
      return studentRepository.findAll()

    }
    fun save(student: Student):Student {
        return studentRepository.save(student)
    }
}
