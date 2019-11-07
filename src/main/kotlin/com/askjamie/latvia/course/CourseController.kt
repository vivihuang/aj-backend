package com.askjamie.latvia.course

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/course")
class CourseController(private val courseService: CourseService) {
    @GetMapping
    fun get(@RequestParam subCategory: String) = courseService.search(subCategory)
}
