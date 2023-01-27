package com.sampson.KotlinApi.controller

import com.sampson.KotlinApi.model.Employee
import com.sampson.KotlinApi.service.EmployeeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
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

    @GetMapping("/{id}")
    fun getEmployeeById(@PathVariable id: Long): ResponseEntity<Employee> {
        return ResponseEntity.ok(employeeService.getEmployeeById(id).get())
    }

    @PostMapping
    fun saveEmployee(@RequestBody employee: Employee) :  ResponseEntity<Employee> {
        return ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED)
    }

}