package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.pojo.Mobile;
import com.pojo.User;

import DatabaseConnection.ConnectionFactory;



public class FlipkartDao {
	
	
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
	
	public User getLogin(String userId,String password)throws Exception {
		User user=new User();
		Connection conn =ConnectionFactory.getConnection();
		String query="select * from customer where userId=? and userPassword=?";
		PreparedStatement ps=conn.prepareStatement(query);
		ps.setString(1, userId);
		ps.setString(2,password);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("userAddress"));
			user.setUserEmail(rs.getString("userEmail"));
			user.setUserId(rs.getString("userId"));
			user.setUserMobileNumber(rs.getString("userMobileNumber"));
			user.setUserName(rs.getString("userName"));
			user.setUserPassword(rs.getString("userPassword"));
			
		}
		
		System.out.println(user.getUserName());
		
		/*String query1="select * from purchase where userId=?";
		PreparedStatement ps1=conn.prepareStatement(query1);
		ps1.setString(1,userId);
		ResultSet rs1=ps.executeQuery();
		while(rs1.next()) {
			user.addProduct(rs1.getString("productId"));
		}*/
		
		
		return user;
		
		
}
	
	
	public User  signUp(User user)throws Exception {
		Connection conn =ConnectionFactory.getConnection();
		String query="insert into customer values(?,?,?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(query);
		ps.setString(1,user.getUserId());
		ps.setString(2, user.getUserPassword());
		ps.setString(3,user.getUserName());
		ps.setString(4,user.getUserAddress());
		ps.setString(5,user.getUserMobileNumber());
		ps.setString(6, user.getUserEmail());
		
		int x=ps.executeUpdate();
		if(x==1)
			return user;
		else
			return new User();
		
		
		
		
	}
	
 
	
	
	

}
