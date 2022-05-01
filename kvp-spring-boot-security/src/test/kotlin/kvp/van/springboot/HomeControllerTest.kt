package kvp.van.springboot

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType
import org.springframework.security.test.context.support.WithMockUser
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.view

@WebMvcTest(HomeController::class)
class HomeControllerTest(
    @Autowired
    private val mockMvc: MockMvc
) {

    @Test
    @WithMockUser
    fun helloTest() {
        mockMvc.perform(get("/hello")
            .accept(MediaType.TEXT_HTML))
            .andExpect(status().isOk)
            .andExpect(view().name("hello"))
    }

    @Test
    @WithMockUser
    fun myTest() {
        mockMvc.perform(get("/my"))
            .andExpect(status().isOk)
            .andExpect(view().name("my"))
    }
}