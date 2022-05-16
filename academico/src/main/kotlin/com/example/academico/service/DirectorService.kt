package com.example.academico.service

import com.example.academico.model.Director
import com.example.academico.model.Student

import com.example.academico.repository.DirectorRepository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DirectorService {
    @Autowired
    lateinit var directorRepository: DirectorRepository
    fun list():List<Director> {
        return directorRepository.findAll()

    }
    fun save(director: Director): Director {
        return directorRepository.save(director)
    }




}