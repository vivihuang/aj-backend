package com.askjamie.latvia.course

interface CourseRepository {
    fun search(subcategory: String): List<Course>
}
