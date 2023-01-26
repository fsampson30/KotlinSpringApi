package com.sampson.KotlinApi.controller

import com.sampson.KotlinApi.model.Employee
import com.sampson.KotlinApi.service.EmployeeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/employees")
class EmployeeController() {

    @Autowired
    lateinit var employeeService: EmployeeService


    @GetMapping
    fun getAllEmployees(): MutableList<Employee> {
        return employeeService.getAllEmployees()
    }

}