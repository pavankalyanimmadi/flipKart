package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class User {
	 private String userId;
	 private String userPassword;
	 private String userName;
	 private String userAddress;
	 private String userMobileNumber;
	 private String userEmail;
	 private List<Product> products;
	 
	 
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public User() {
		products=new ArrayList<Product>();
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPassword=" + userPassword + ", userName=" + userName + ", userAddress="
				+ userAddress + ", userMobileNumber=" + userMobileNumber + ", userEmail=" + userEmail + ", products="
				+ products + "]";
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserMobileNumber() {
		return userMobileNumber;
	}
	public void setUserMobileNumber(String userMobileNumber) {
		this.userMobileNumber = userMobileNumber;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	 
	 
	 

}
