package au.com.rainmore.centus.integration.modules.cms.controllers;

import au.com.rainmore.centus.integration.BaseControllerSpec;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@DisplayName("Test cms.controllers.Controller")
public class ControllerSpec extends BaseControllerSpec {

    @Test
    @DisplayName("Test hello() return expected value")
    public void testGetRequestToHello(@Autowired MockMvc mvc) throws Exception {
        String expectedResponse = "hello, world";
        mvc.perform(get("/api/cms"))
                .andExpect(status().isOk())
                .andExpect(content().string(expectedResponse));
    }

}
