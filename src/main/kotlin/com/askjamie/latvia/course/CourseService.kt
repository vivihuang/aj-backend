package com.askjamie.latvia.course

import org.springframework.stereotype.Service

@Service
class CourseService(private val courseRepository: CourseRepository) {
    fun search(subCategory: String) = courseRepository.search(subCategory)
}
