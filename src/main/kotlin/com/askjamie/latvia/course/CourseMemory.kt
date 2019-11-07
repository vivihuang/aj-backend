package com.askjamie.latvia.course

import org.springframework.stereotype.Repository

@Repository
class CourseMemory : CourseRepository {
    private val coursesList = listOf(Course("coffee", "https://onepa.com/courses?subCategory=coffee", "coffee"))

    override fun search(subCategory: String) = coursesList.filter { it.subCategory == subCategory }
}
