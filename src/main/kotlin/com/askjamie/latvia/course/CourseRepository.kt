package com.askjamie.latvia.course

interface CourseRepository {
    fun search(subCategory: String): List<Course>
}