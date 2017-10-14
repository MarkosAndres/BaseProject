package com.marcos.springboot.controller;

import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.marcos.springboot.entities.User;
import com.marcos.springboot.service.UserService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = UserController.class, secure = false)
@ActiveProfiles("test")
public class UserControllerTest {
	
	@Autowired
    private MockMvc mockMvc;
	
	@MockBean
    private UserService userService;
	
	String username = "rock";	
	User user = new User();
	
	@Test
    public void testExample() throws Exception {

		user.setUsername(username);
		
        given(userService.findById(1L))
                .willReturn(user);
        
        mockMvc.perform(get("/user/1").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("username", is(username)));
    }
	
	@Test
	public void retrieveDetailsForCourse() throws Exception {
		user.setUsername(username);

		Mockito.when(
				userService.findById(1L)).thenReturn(user);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/user/1").accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		System.out.println(result.getResponse());
		String expected = "{id:Course1,name:Spring,description:10 Steps}";
		
		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
	} 
}
