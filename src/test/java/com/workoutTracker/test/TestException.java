package com.workoutTracker.test;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.workout.hibernate.common.UserAlreadyExistException;
import com.workout.hibernate.common.UserDoesNotExistException;
import com.workout.hibernate.common.WorkoutCategoryAlreadyExistException;
import com.workout.hibernate.common.WorkoutCategoryDoesNotExistException;
import com.workout.hibernate.model.User;
import com.workout.hibernate.model.WorkoutCategory;
import com.workout.hibernate.model.WorkoutCollection;
import com.workout.hibernate.service.LoginService;
import com.workout.hibernate.service.UserService;
import com.workout.hibernate.service.UserServiceImpl;



public class TestException {

	@Test
    public void testForUserRegistration() throws UserAlreadyExistException 
    {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("workout-application.xml");
	   User user=new User();
	   user.setUserId(12);
	   user.setUserName("james");
	   user.setUserPassword("1234hello");
	   user.setContactNumber(1234567891);
	   user.setUserEmail("example@example.com");
	   LoginService loginservice = (LoginService) context.getBean("LoginService");
	   loginservice.signUp(user.getUserEmail(),user.getUserName(),user.getUserPassword());
Assert.assertEquals(true,UserAlreadyExistException.message);
    }
	
	@Test
    public void testForUserLogin() throws UserDoesNotExistException  
    {
		
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("workout-application.xml");
	   User user=new User();
	   user.setUserId(12);
	   user.setUserName("james");
	   user.setUserPassword("1234hello");
	   user.setContactNumber(1234567891);
	   user.setUserEmail("example@example.com");
	 LoginService loginservice = (LoginService) context.getBean("LoginService");
loginservice.signIn(user.getUserName(),user.getUserPassword());
Assert.assertEquals(true,UserDoesNotExistException.message);
    }
	
	@Test
	public void testWorkoutCategoryAlreadyExist() throws WorkoutCategoryAlreadyExistException
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("workout-application.xml");
		//public void addCategory(WorkoutCategory workoutCategory);
		WorkoutCategory workoutCategory=new WorkoutCategory();
		 workoutCategory.setCategoryId(1);
		 workoutCategory.setCategoryName("yoga");
		 UserService userservice = (UserService) context.getBean("LoginService");
		 userservice.addCategory(workoutCategory);
	}
	 @Test
	 public void testWorkoutDelete() throws WorkoutCategoryDoesNotExistException
	 {
		 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("workout-application.xml");
		 WorkoutCategory workoutCategory=new WorkoutCategory();
		 workoutCategory.setCategoryId(1);
		 workoutCategory.setCategoryName("yoga");
		UserService userservice = (UserService) context.getBean("userService");
		 userservice.deleteCategory(workoutCategory.getCategoryId());
		
	 }
	
}
