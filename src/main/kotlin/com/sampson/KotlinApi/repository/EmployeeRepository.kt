package com.sampson.KotlinApi.repository

import com.sampson.KotlinApi.model.Employee
import org.springframework.data.jpa.repository.JpaRepository


interface EmployeeRepository : JpaRepository<Employee, Long> {
}