package com.workoutTracker.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workout.hibernate.model.User;
import com.workout.hibernate.model.WorkoutCategory;
import com.workout.hibernate.model.WorkoutCollection;
import com.workout.hibernate.service.LoginService;
import com.workout.hibernate.service.UserService;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TestFunctional extends TestCase {

	//Testing user adding category to workout
	
	@Test
	public void testAddCategory()
	{
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("workout-application.xml");
	WorkoutCategory wc= new WorkoutCategory();
	wc.setCategoryId(12);
	wc.setCategoryName("yoga");
	List <WorkoutCategory> newList = new ArrayList<WorkoutCategory>();
	newList.add(wc);
	UserService userservice=(UserService) context.getBean("userservice");
	 List category=userservice.viewCategory(12);
	 Assert.assertNotNull(category);
	}
	
	//user adding workout details and viewing 
	
	@Test
	public void testAddWorkout()
	{
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("workout-application.xml");
	WorkoutCollection wc=new WorkoutCollection();
	wc.setWorkoutId(12);
	wc.setCategoryId(13);
	wc.setWorkoutNote("finished");
	wc.setWorkoutTitle("gym");
	wc.setCaloriesBurntPerMinute((float) 0.05);
	
	List <WorkoutCollection> newList = new ArrayList<WorkoutCollection>();
	newList.add(wc);
	UserService userservice=(UserService) context.getBean("userservice");
	 List orderedList=userservice.viewWorkout(12);
	 Assert.assertNotNull(orderedList);
	}
	
	@Test
	public void testDeleteWorkout()
	{
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("workout-application.xml");
	WorkoutCollection wc=new WorkoutCollection();
	wc.setCategoryId(13);
	wc.setWorkoutNote("finished");
	wc.setWorkoutTitle("gym");
	wc.setCaloriesBurntPerMinute((float) 0.05);
	UserService userservice=(UserService) context.getBean("userservice");
	boolean serviceDeleted=userservice.deleteCategory(wc.getWorkoutId());
	assertEquals(1,serviceDeleted);
	}
	
	@Test
	public void testEditWorkout()
	{
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("workout-application.xml");
	WorkoutCollection wc=new WorkoutCollection();
	wc.setCategoryId(13);
	wc.setWorkoutNote("finished");
	wc.setWorkoutTitle("gym");
	wc.setCaloriesBurntPerMinute((float) 0.05);
	UserService userservice=(UserService) context.getBean("userservice");
	boolean workoutEdited=userservice.editWorkout(wc.getWorkoutId());
	assertEquals(1,workoutEdited);
	}
	
	@Test
	public void testEditCategory()
	{
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("workout-application.xml");
	WorkoutCategory wc= new WorkoutCategory();
	wc.setCategoryId(12);
	wc.setCategoryName("yoga");
	UserService userservice=(UserService) context.getBean("userservice");
	boolean workoutcategoryEdited=userservice.editCategory(wc.getCategoryId());
	assertEquals(1,workoutcategoryEdited);
	}
	

	@Test
	public void testDeleteCategory()
	{
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("workout-application.xml");
	WorkoutCategory wc= new WorkoutCategory();
	wc.setCategoryId(12);
	wc.setCategoryName("yoga");
	
	UserService userservice=(UserService) context.getBean("userservice");
	boolean serviceDeleted=userservice.deleteCategory(wc.getCategoryId());
	assertEquals(1,serviceDeleted);
	}
	@Test
	public void testRegister()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("workout-application.xml");

		User user=new User();
		user.setUserId(12);
		user.setUserName("james");
		user.setUserEmail("james@gmail.com");
		user.setUserPassword("hello123");
		user.setContactNumber(12345678);
		
		LoginService loginservice=(LoginService) context.getBean("loginService");
		loginservice.signUp(user.getUserName(),user.getUserPassword(),user.getUserEmail());
		boolean userfromdb =loginservice.signUp(user.getUserName(),user.getUserPassword(),user.getUserEmail());
		assertSame(true,userfromdb);
	}
	
	
}
