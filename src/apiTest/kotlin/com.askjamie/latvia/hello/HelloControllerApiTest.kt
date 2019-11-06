package com.askjamie.latvia.hello

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest
internal class HelloControllerApiTest(@Autowired private val mockMvc: MockMvc) {

    @Test
    fun `should return hello msg when request hello given a name`() {
        mockMvc.perform(
                get("/hello").param("name", "Latvia")
        )
                .andExpect(status().isOk)
                .andExpect(content().string("hello, Latvia!"))
    }
}
