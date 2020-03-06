package com.workout.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.workout.hibernate.dao.LoginServiceDao;

@Component
@Service ("loginService")

public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginServiceDao loginServiceDao;
	@Transactional

	public boolean signUp(String userName, String userPassword, String userEmail) {
		return false;
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
