/**
 * 
 */
package com.school.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.school.dao.LoginDAO;
import com.school.db.Roles;
import com.school.db.User;

/**
 * @author shiva
 *
 */
public class LoginDAOImpl implements LoginDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> list() {
		Session session = this.sessionFactory.getCurrentSession();
		List<User> personList = session.createQuery("from User").list();
		return personList;
	}

	@Override
	public boolean validateUser(String userName, String password, String domain) {

		Session session = this.sessionFactory.getCurrentSession();
		User user = (User) session.createCriteria(User.class).add(Restrictions.eq("loginID", userName))
				.add(Restrictions.eq("password", password)).uniqueResult();
		if (user != null) {
			return true;
		}
		return false;
	}

}
