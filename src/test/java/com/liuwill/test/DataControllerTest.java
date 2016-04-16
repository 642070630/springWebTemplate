package com.liuwill.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Administrator on 2016/4/16 0016.
 */
@WebAppConfiguration(value = "src/main/webapp")
@ContextConfiguration(locations = {"/config/spring-mvc.xml","/config/spring-context.xml" })
public class DataControllerTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private WebApplicationContext wac;

    private static String URI = "/data/success";//RESTurl.searchPersonalFile;
    private MockMvc mockMvc;

    @BeforeClass(groups = {"context","data"})
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }


    @Test(groups = {"data"})
    public void testSuccess() throws Exception {
        System.out.println("Load List Json");
        mockMvc.perform(MockMvcRequestBuilders.get("/data/success").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.code").value("success"))
                .andDo(print());
        System.out.println("测试控制器 DataController:");
    }

}
