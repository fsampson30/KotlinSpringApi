package com.sampson.KotlinApi.service


import com.sampson.KotlinApi.model.Employee
import com.sampson.kotlinapi.repository.EmployeeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.Optional


@Service
class EmployeeService() {

    @Autowired
    lateinit var employeeRepository: EmployeeRepository

    fun getAllEmployees(): MutableList<Employee> {
        return employeeRepository.findAll()
    }

    fun getEmployeeById(id: Long) : Optional<Employee>{
        return employeeRepository.findById(id)
    }

    fun saveEmployee(employee: Employee) : Employee{
        return employeeRepository.save(employee)
    }

}