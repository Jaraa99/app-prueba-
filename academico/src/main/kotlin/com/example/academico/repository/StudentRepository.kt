package com.example.academico.repository

import com.example.academico.model.Director
import com.example.academico.model.Student
import com.example.academico.model.Teacher
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository:JpaRepository<Student, Long> {

}

interface TeacherRepository:JpaRepository<Teacher, Long> {

}

interface DirectorRepository:JpaRepository<Director, Long> {

}