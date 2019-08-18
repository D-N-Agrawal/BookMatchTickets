package com.matchBook.business;

import com.matchBook.entity.USER;
import com.matchBook.persistence.MatchBookDao;
import com.matchBook.persistence.MatchBookDaoImpl;

public class MatchBookBLimpl implements MatchBookBL {
	
	private MatchBookDao matchBookDao = new MatchBookDaoImpl();
	
	public boolean addUser(USER user) {
		return matchBookDao.insertUser(user);
	}

	public boolean validate(String mail, String password) {
		 USER user = matchBookDao.searchUser(mail);
		 System.out.println(user.getMail() + user.getPassword());
		 if( user.getPassword().equals(password)) {
			 return true;
		 }
		 else  return false;
	}
}
