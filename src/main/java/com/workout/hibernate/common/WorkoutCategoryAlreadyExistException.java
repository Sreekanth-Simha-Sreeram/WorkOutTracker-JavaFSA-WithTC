package com.workout.hibernate.common;

public class WorkoutCategoryAlreadyExistException  extends Exception{
	public static  String message="category already exists !..please login";


	public WorkoutCategoryAlreadyExistException()
	{
		
	}
	public WorkoutCategoryAlreadyExistException(String message)
	{
		this.message=message;
	}
}
