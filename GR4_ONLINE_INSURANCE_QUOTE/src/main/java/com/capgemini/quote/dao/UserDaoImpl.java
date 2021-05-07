package com.capgemini.quote.dao;

import javax.persistence.EntityManager;

import com.capgemini.quote.bean.User;
import com.cg.capgemini.quote.utill.JPAUtil;

public class UserDaoImpl implements UserDao {
	
	private EntityManager em;
	
	public UserDaoImpl() {
		em = JPAUtil.getEntityManager();
	}

	@Override
	public User getId(String userid)
	{
		User u1 = em.find(User.class, userid);
		
		return u1;
	}

}
