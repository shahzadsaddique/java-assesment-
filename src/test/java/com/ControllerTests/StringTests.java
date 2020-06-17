package com.ControllerTests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = String.class)
public class StringTests
{
    @Autowired
    MockMvc mockMvc;

    @Test
    public void testStringReverseEndPoint() throws Exception
    {
        try
        {
            String input = "muz";
            String output = "{" + "\"value\":" + "\"zum\""+ "}";
            mockMvc.perform(MockMvcRequestBuilders
                    .get("/string/reverse")
                    .param("input", input))
                    .andExpect(MockMvcResultMatchers.status().is(200))
                    .andExpect(MockMvcResultMatchers.content().string(output));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testStringcheckShuffledEndPoint() throws Exception
    {
        try
        {
            String input = "{" +
                    "\t\"s1\": \"ab\"," +
                    "\t\"s2\": \"cd\"," +
                    "\t\"s3\": \"abfcd\"" +
                    "}";
            String output = "true";
            mockMvc.perform(MockMvcRequestBuilders
                    .get("/string/checkShuffled")
                    .param("input", input))
                    .andExpect(MockMvcResultMatchers.status().is(200))
                    .andExpect(MockMvcResultMatchers.content().string(output));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
