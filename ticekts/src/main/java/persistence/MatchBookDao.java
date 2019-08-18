package com.matchBook.persistence;

import com.matchBook.entity.USER;

public interface MatchBookDao {

	public boolean insertUser(USER user);
	public USER searchUser(String mail);
}
