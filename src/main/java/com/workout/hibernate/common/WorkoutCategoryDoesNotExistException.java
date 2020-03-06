package com.workout.hibernate.common;

public class WorkoutCategoryDoesNotExistException extends Exception {
	public static  String message="user already exists !..please login";


	public WorkoutCategoryDoesNotExistException()
	{
		
	}
	public WorkoutCategoryDoesNotExistException(String message)
	{
		this.message=message;
	}
}
