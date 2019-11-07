package com.askjamie.latvia.course

import com.ninjasquad.springmockk.MockkBean
import io.mockk.every
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest(controllers = [CourseController::class])
internal class CourseControllerApiTest(@Autowired private val mockMvc: MockMvc) {

    @MockkBean
    private lateinit var courseService: CourseService

    private val subcategory = "coffee"

    @BeforeEach
    internal fun setUp() {
        every { courseService.search(subcategory) } returns emptyList()
    }

    @Test
    fun `should return when search courses given a subcategory`() {
        mockMvc.perform(
                get("/api/course").param("subcategory", subcategory)
        )
                .andExpect(status().isOk)
    }
}
