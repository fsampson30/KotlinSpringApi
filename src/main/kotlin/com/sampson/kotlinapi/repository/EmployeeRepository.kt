package com.sampson.kotlinapi.repository

import com.sampson.kotlinapi.model.Employee
import org.springframework.data.jpa.repository.JpaRepository


interface EmployeeRepository : JpaRepository<Employee, Long> {
}