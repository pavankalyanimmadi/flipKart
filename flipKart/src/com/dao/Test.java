package com.dao;

import com.pojo.Mobile;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("hiiiii");
		MobileOperations mo=new MobileOperations();
		try {
		Mobile m=mo.getMobileDetails("mob101");
		System.out.println(m);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		

	}

}
