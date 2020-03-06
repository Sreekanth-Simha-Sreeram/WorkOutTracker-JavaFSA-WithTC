package com.workout.hibernate.service;

public interface LoginService {
	
	public void signUp(String userName, String userPassword,String userEmail);
	public boolean signIn(String userName, String password);
	public void forgotPassword(String userEmail);
	public void resetPassword(String newPassword, String username);
	public void logOut(int userId);

}
