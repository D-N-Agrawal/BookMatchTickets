package com.matchBook.presentation;

import java.util.Scanner;

import com.matchBook.business.MatchBookBL;
import com.matchBook.business.MatchBookBLimpl;
import com.matchBook.entity.USER;
import com.matchBook.util.MatchBookHelper;

public class MatchBookPresentImpl implements MatchBookPresent {

	public MatchBookBL matchBookBL = new MatchBookBLimpl();
	
	public void showMenu() {
		System.out.println("1. SIGN-UP ");
		System.out.println("2. LOG-IN");
		System.out.println("3. Exit");
		
	}
	
	public void performMenu(int choice) {
		
		Scanner sc=new Scanner(System.in);
		switch(choice){
		case 1:
			USER user = MatchBookHelper.getUserDetail();
			if(matchBookBL.addUser(user)) {
				System.out.println("WELLCOME "+ user.getName() + "");
			}
			
			else {
				System.out.println("user not inserted");
			}
			break;
			
		case 2:
			break;
		
		case 3:
			System.out.println("Good Bye!! Have a Nice Day!!");
			System.exit(0);
			break;
			
	    default:
			System.out.println("Invalid Choice");
			
	}
	
	}
}