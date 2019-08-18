package com.matchBook.business;

import com.matchBook.entity.USER;
import com.matchBook.persistence.MatchBookDao;
import com.matchBook.persistence.MatchBookDaoImpl;

public class MatchBookBLimpl implements MatchBookBL {
	
	private MatchBookDao matchBookDao = new MatchBookDaoImpl();
	
	public boolean addUser(USER user) {
		return matchBookDao.insertUser(user);
	}

}
