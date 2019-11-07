package com.askjamie.latvia.course

import org.springframework.stereotype.Repository

@Repository
class CourseMemory : CourseRepository {
    private val courses = listOf(Course("coffee", "https://onepa.com/courses?subCategory=coffee", "coffee"))

    override fun search(subCategory: String) = courses.filter { it.subCategory == subCategory }
}
