package com.service;

import com.dao.MobileOperations;
import com.pojo.Mobile;

public class FlipkartService {
	private MobileOperations mobileOper;
	
	public Mobile getMobile(String productId) {
		mobileOper=new MobileOperations();
		Mobile mobile=new Mobile();
		try {
		 mobile=mobileOper.getMobileDetails(productId);
		}
		catch(Exception e) {
			
		}
		return mobile;
		
		
	}
	

}
