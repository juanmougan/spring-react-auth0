package com.github.juanmougan.springreactauth0.model

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * Holds information about an Employee.
 */

@Entity
data class Employee (
        @Id
        @GeneratedValue
        val id: Long? = null,
        val firstName: String,
        val lastName: String,
        val description: String
) : Serializable {
    constructor(firstName: String, lastName: String, description: String) :
            this(null, firstName, lastName, description)
}
