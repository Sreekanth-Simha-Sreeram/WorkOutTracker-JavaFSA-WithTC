 package com.workoutTracker.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

import com.workout.hibernate.model.User;
import com.workout.hibernate.model.WorkoutCategory;
import com.workout.hibernate.model.WorkoutCollection;



public class TestBoundary {

	//user password length must be equal to 10
	@Test
	public void testpasswordLength()
	{
		User user=new User();
		user.setUserId(12);
		user.setUserName("james");
		user.setUserEmail("james@gmail.com");
		user.setUserPassword("hello123");
		user.setContactNumber(12345678);
		int passwordLength=10;
		assertNotEquals(passwordLength,user.getUserPassword().length());
		
		
	}
	
	
	
	@Test
	public void testWorkoutCategory()
	{
		WorkoutCategory wc=new WorkoutCategory();
		wc.setCategoryId(1);
		wc.setCategoryName("webapp");
		
	assertNotNull(wc.getCategoryName());
	}

	
	
	@Test
	public void testWorkoutCaloriesBurnt()
	{
		WorkoutCollection wc=new WorkoutCollection();
		wc.setCaloriesBurntPerMinute((float) 2.5);
		wc.setCategoryId(12);
		wc.setWorkoutNote("working");
		wc.setWorkoutId(120);
		wc.setWorkoutTitle("cycling");
		
		assertNotNull(wc.getCaloriesBurntPerMinute());
	}
	
	
	@Test
	public void testWorkoutTitle()
	{
		WorkoutCollection wc=new WorkoutCollection();
		wc.setCaloriesBurntPerMinute((float) 2.5);
		wc.setCategoryId(12);
		wc.setWorkoutNote("working");
		wc.setWorkoutId(120);
		wc.setWorkoutTitle("cycling");
		assertNotNull(wc.getWorkoutTitle());
	}
	
	@Test
	public void testPhoneNumberLength()
	{
		User user=new User();
		user.setUserId(12);
		user.setUserName("james");
		user.setUserEmail("james@gmail.com");
		user.setUserPassword("hello123");
		user.setContactNumber(1234567891);
	    int phonenumberLength=10;  
	    int getLengthOfNumber=(Integer.toString(user.getContactNumber()).length());
	    assertEquals( phonenumberLength, getLengthOfNumber);

	}
	
}
	
	
	
	
	
	
	
	
	
	
	

