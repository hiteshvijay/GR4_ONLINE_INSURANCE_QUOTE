package com.capgemini.quote.user;

import com.capgemini.quote.bean.User;
import com.capgemini.quote.dao.UserDao;
import com.capgemini.quote.dao.UserDaoImpl;

public class TestProject {

	public static void main(String[] args) {
		UserDao dao = new UserDaoImpl();
		User u = dao.getId("jay");
		
		System.out.println(u);

	}

}
