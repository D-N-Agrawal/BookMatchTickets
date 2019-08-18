package com.matchBook.client;

import java.util.Scanner;

import com.matchBook.presentation.MatchBookPresent;
import com.matchBook.presentation.MatchBookPresentImpl;


public class MyMain {

	public static void main(String[] args) {
		MatchBookPresent matchBookPresent=new MatchBookPresentImpl();
		Scanner sc=new Scanner(System.in);
		while(true){
			matchBookPresent.showMenu();
			System.out.println("Enter choice :");
			int choice=sc.nextInt();
			matchBookPresent.performMenu(choice);
		}
	}

}
