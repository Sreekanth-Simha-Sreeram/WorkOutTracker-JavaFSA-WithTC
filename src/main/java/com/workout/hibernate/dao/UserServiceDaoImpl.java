package com.workout.hibernate.dao;


import java.sql.Time;

import java.util.Date;
import java.util.List;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.workout.hibernate.model.WorkoutCategory;
import com.workout.hibernate.model.WorkoutCollection;

@Component


public class UserServiceDaoImpl implements UserServiceDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Transactional
	public void addWorkout(WorkoutCollection workoutCollection) {
		// TODO Auto-generated method stub

	}
	@Transactional
	public void editWorkout(int workoutId) {
		// TODO Auto-generated method stub

	}
	@Transactional
	public boolean deleteWorkout(int workoutId) {
		return false;
		// TODO Auto-generated method stub

	}
	@Transactional
	public List<WorkoutCollection> viewWorkout(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public void addCategory(WorkoutCategory workoutCategory) {
		// TODO Auto-generated method stub

	}
	@Transactional
	public void editCategory(int categoryId) {
		// TODO Auto-generated method stub

	}

	public void deleteCategory(int categoryId) {
		// TODO Auto-generated method stub

	}
	@Transactional
	public List<WorkoutCategory> viewCategory(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public void startWorkout(int workoutId, int userId) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public void endWorkout(int workoutId, int userId) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public void generateReport(Date startDate, Date endDate) {
		// TODO Auto-generated method stub

	}

}
