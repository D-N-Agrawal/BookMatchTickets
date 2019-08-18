package com.matchBook.business;

import com.matchBook.entity.USER;

public interface MatchBookBL {
	public boolean addUser(USER user);
	public boolean validate(String mail, String password);
}
