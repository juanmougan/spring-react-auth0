package com.github.juanmougan.springreactauth0.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * Holds information about an Employee.
 */

@Entity
data class Employee(
        @Id
        @GeneratedValue
        val id: Long,
        val firstName: String,
        val lastName: String,
        val description: String
)