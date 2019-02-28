package com.service;

import com.dao.FlipkartDao;
import com.pojo.Mobile;
import com.pojo.User;

public class FlipkartService {
	private FlipkartDao flipkartDao;
	
	public Mobile getMobile(String productId) {
		flipkartDao=new FlipkartDao();
		Mobile mobile=new Mobile();
		try {
		 mobile=flipkartDao.getMobileDetails(productId);
		}
		catch(Exception e) {
			
		}
		return mobile;
		
		
	}
	
	public User getLogin(String userId,String password) {
		flipkartDao=new FlipkartDao();
		User user=new User();
		
		try {
			user=flipkartDao.getLogin(userId, password);
		}
		
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return user;
		
	}
	
	public User signUp(User user) {
		flipkartDao=new FlipkartDao();
		User user1=new User();
		try {
		user1=flipkartDao.signUp(user);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return user1;
		
		
	}
	

}
