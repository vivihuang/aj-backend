package com.askjamie.latvia.hello

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/hello")
    fun hello(@RequestParam(defaultValue = "World") name: String) = "hello, $name!"
}
