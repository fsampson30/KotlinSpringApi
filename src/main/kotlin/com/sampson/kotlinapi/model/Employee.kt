package com.sampson.kotlinapi.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.math.BigDecimal
import java.time.LocalDate

@Entity
data class Employee(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String = "",
    val title: String = "",
    val salary: BigDecimal = BigDecimal.ZERO,
    val admissionDate : LocalDate = LocalDate.now()
)
