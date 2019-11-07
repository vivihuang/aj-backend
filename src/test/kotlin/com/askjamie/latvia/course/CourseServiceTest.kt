package com.askjamie.latvia.course

import fixture.CourseFixture
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import io.mockk.verify
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
internal class CourseServiceTest {

    @MockK
    private lateinit var courseRepository: CourseRepository

    @InjectMockKs
    private lateinit var courseService: CourseService

    @Test
    fun `should call repository when search courses given a subcategory`() {
        val subcategory = "coffee"
        val courses = listOf(CourseFixture.sample)
        every { courseRepository.search(subcategory) } returns courses

        val result = courseService.search(subcategory)

        assertEquals(courses, result)
        verify(exactly = 1) {
            courseRepository.search(subcategory)
        }
    }
}
