package com.zensar.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author Gourab Sarkar, 2019.
 * @version 0.1
 * @creation_date Sep. 21, 2019 05:37 PM
 * @modification_date Sep. 23, 2019 10:20 AM
 * @copyright Zensar Technologies, India. All rights reserved.
 * @description It is Data Access Object (DAO) interface implementer class.
 * 				It is used in Persistence Layer of Application.
*/

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.User;

/**
 * @author Gourab Sarkar
 * @version 2.0
 * @creation_date 21 Sep 2019 17:35
 * @modification_date 28 Sep 2019 11:14
 * @copyright (c) Zensar Technologies. All rights reserved.
 * @description It is Data Access Object Interface implementer class.
 * 				It is used in Persistence Layer of Application.
 */

public class UserDaoImpl implements UserDao {

	private Session session;
	
	public UserDaoImpl() {
		Configuration configuration = new Configuration().configure();
		SessionFactory sf = configuration.buildSessionFactory();
		session = sf.openSession();
	}
	
	@Override
	public void insert(User user) {
		Transaction t = session.beginTransaction();
		session.save(user);
		t.commit();
	}

	@Override
	public void update(User user) {
		Transaction t = session.beginTransaction();
		session.update(user);
		t.commit();
	}

	@Override
	public void delete(User user) {
		Transaction t = session.beginTransaction();
		session.delete(user);
		t.commit();
	}

	@Override
	public User getByUsername(String username) {
		return session.get(User.class, username);
	}

	@Override
	public List<User> getAll() {
		Query q = session.createQuery("FROM User");			// User is the class name. Hibernate does not understand table name.
		return q.getResultList();
	}

	
	
}
