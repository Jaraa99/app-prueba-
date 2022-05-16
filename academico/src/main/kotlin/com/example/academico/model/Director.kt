package com.example.academico.model

import javax.persistence.*

@Entity
@Table(name= "teacher" )
class Director {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? =null
    var name: String? = null
    var office: String? = null
    var officeHour: String? = null
    var edad: Long? = null


}