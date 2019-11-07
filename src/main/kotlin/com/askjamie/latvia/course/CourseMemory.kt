package com.askjamie.latvia.course

import org.springframework.stereotype.Repository

@Repository
class CourseMemory : CourseRepository {
    private val courses = listOf(Course("coffee", "https://onepa.com/courses?subcategory=coffee", "coffee"))

    override fun search(subcategory: String) = courses.filter { it.subcategory == subcategory }
}
