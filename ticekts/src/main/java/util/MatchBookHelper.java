package com.matchBook.util;

import java.util.Scanner;

import com.matchBook.entity.USER;

public class MatchBookHelper {

	static public USER getUserDetail() { 	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Name : ");
	String name=sc.next();
	System.out.println("Enter Your Mail Id : ");
	String mail=sc.next();
	System.out.println("Enter Your Mobile Number : ");
	String mobile=sc.next();
	System.out.println("Create a Password : ");
	String password=sc.next();

	USER user=new USER(name,mobile,mail,password);
	
	return user;
	
	}
}
