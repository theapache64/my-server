package com.theapache64.myserver.server

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping("/say_hello")
    @ResponseBody
    fun sayHello(): String {
        return "Hello !!!!"
    }

}