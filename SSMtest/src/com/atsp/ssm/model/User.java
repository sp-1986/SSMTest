package com.atsp.ssm.model;

public class User {
	private int id;
	private String userName;
	private int age;
	public User(int id, String userName, int age) {
		super();
		this.id = id;
		this.userName = userName;
		this.age = age;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", age=" + age + "]";
	}
	
	
}
