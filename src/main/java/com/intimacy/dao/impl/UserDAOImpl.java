package com.intimacy.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.intimacy.dao.UserDAO;
import com.intimacy.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public List<User> getUsers() {
		// get the current Hibernate Session

		Session currentSession = sessionFactory.getCurrentSession();

		// Create query

		Query<User> theQuery = currentSession.createQuery("from User", User.class);

		// execute and result
		List<User> users = theQuery.getResultList();
		// return
		return users;
	}

}
