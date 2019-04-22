package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.demo.controller.FooController;

@RunWith(SpringRunner.class)
@WebMvcTest(FooController.class)
public class FooControllerTest {

	@Autowired
	private MockMvc mvc;

	@Test
	public void testPrint() throws Exception {	
		mvc.perform(MockMvcRequestBuilders.get("/foos").contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.field1").value("Hello!"));
	}

}
