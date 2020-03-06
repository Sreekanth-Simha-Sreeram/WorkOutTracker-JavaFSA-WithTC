package com.workout.hibernate.dao;

public interface LoginServiceDao {
	
	public void signUp(String userName, String userPassword,String userEmail);
	public boolean signIn(String userName, String password);
	public void forgotPassword(String userEmail);
	public void resetPassword(String newPassword, String username);
	public void logOut(int userId);

}
