package com.asif.java8Learning.PredicateFuncInterface4;

import java.util.Scanner;
import java.util.function.Predicate;

class UserDto {

	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserDto(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

}

public class PredicateFuncInterface_UserNameAndPwdEg1 {

	public static void main(String[] args) {

		//Predicate creating a Function, to call it use its impl method test()
		Predicate<UserDto> p = u -> u.getUserName().equals("asif") && u.getPassword().equals("password");

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter UserName :");
			String userName = scanner.next();
			System.out.println("Enter Password :");
			String password = scanner.next();
			
			UserDto userDto = new UserDto(userName, password);
			if(p.test(userDto)){
				System.out.println("Credentials are correct!!!");
				
			}else {
				System.out.println("Wrong Credentials :(");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
