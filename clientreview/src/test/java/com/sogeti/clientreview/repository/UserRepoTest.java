package com.sogeti.clientreview.repository;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import com.sogeti.clientreview.documents.User;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {UserRepo.class})
@TestExecutionListeners(listeners = {DependencyInjectionTestExecutionListener.class})
@Configuration
public class UserRepoTest {
	
	
	@Autowired
	private UserRepo userRepo;
	
	private User user;
	
	
	@Before
	public void setUp()
	{
	    user = new User();
		user.setUserName("Salim");
		user.setUserPassword("1234");
		user.setUserId("1");
		
	}
	
	@Test
	public void saveUser()
	{
		User savedUser = userRepo.save(user);
		assertNotNull(savedUser);
		
	}
	
	
	
	
	
	

}
