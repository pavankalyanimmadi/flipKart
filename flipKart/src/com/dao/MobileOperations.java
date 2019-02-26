package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.pojo.Mobile;

import DatabaseConnection.ConnectionFactory;



public class MobileOperations {
	
	
	public Mobile getMobileDetails(String productId)throws Exception {
		Mobile mobile=new Mobile();
		
		Connection conn =ConnectionFactory.getConnection();
		
		
		String query="select * from mobile where productId=?";
		
		PreparedStatement pstatement=conn.prepareStatement(query);
		
		pstatement.setString(1,productId);
	    ResultSet resultSet=pstatement.executeQuery();
	    
	    while(resultSet.next()) {
	    	mobile.setInternalStorage(resultSet.getInt("internalStorage"));
	    	mobile.setModel(resultSet.getString("model"));
	    	mobile.setName(resultSet.getString("name"));
	    	mobile.setProductId(resultSet.getString("productId"));
	    	mobile.setProductPrice(resultSet.getDouble("price"));
	    	mobile.setRam(resultSet.getInt("ram"));
	    	mobile.setSize(resultSet.getString("mobilesize"));
	    	
	    	
	    	
	    }
	    return mobile;
		
		
}
	
	
	

}
