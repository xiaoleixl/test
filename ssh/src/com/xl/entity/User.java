package com.xl.entity;

public class User {

	private Integer userId;
	private String userName;
	private String pwd;

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", pwd=" + pwd + "]";
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
