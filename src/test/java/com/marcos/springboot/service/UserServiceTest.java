package com.marcos.springboot.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.marcos.springboot.entities.User;
import com.marcos.springboot.repository.UserRepository;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
public class UserServiceTest {
	
	@TestConfiguration
    static class EmployeeServiceImplTestContextConfiguration {
  
        @Bean
        public UserService userService() {
            return new UserService();
        }
    }
	
	@Autowired
	private UserService userService;
	
	@MockBean
	UserRepository userRepository;
	
	String username;	
	User user;
	
	@Before
	public void setUp() {
		username = "rock";
		
		user = new User();
		user.setUsername(username);
		
		Mockito.when(userRepository.findOne(1L)).thenReturn(user);
	}
	
	@Test
	public void testGetUser() {
		User found = userService.findById(1L);		
		assertEquals(username, found.getUsername());
	}

}
