package com.example.academico.model

import javax.persistence.*


@Entity
@Table(name="Student")
class Student {
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Id
@Column(updatable = false)
     var id: Long? =null
     var name: String? = null
     var lastName: String? = null
     var clase: String? = null
     var gender: String? = null
     var edad: Long? = null


}

