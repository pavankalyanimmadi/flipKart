package com.dao;

import com.pojo.Mobile;
import com.pojo.User;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("hiiiii");
		FlipkartDao mo=new FlipkartDao();
		try {
			User user=new User();
			user.setUserAddress("dfhdfs");
			user.setUserEmail("sdgtsdfghd");
			user.setUserId("venkatesh");
			user.setUserMobileNumber("6237846238");
			user.setUserName("venkatesh");
			user.setUserPassword("venkatesh");
			System.out.println(mo.signUp(user));
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		

	}

}
