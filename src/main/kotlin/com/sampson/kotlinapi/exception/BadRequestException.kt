package com.sampson.KotlinApi.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.BAD_REQUEST)
class BadRequestException : RuntimeException() {
    override val message: String?
        get() = "Employee Not Found"
}