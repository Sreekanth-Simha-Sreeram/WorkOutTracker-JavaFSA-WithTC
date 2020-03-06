package com.workout.hibernate.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Component
@Repository ("loginServiceDao")
public class LoginServiceDaoImpl implements LoginServiceDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public void signUp(String userName, String userPassword, String userEmail) {
		// TODO Auto-generated method stub

	}
	@Transactional
	public boolean signIn(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public void forgotPassword(String userEmail) {
		// TODO Auto-generated method stub

	}
	@Transactional
	public void resetPassword(String newPassword, String username) {
		// TODO Auto-generated method stub

	}
	@Transactional
	public void logOut(int userId) {
		// TODO Auto-generated method stub

	}

}
