/**
 * 
 */
package com.school.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.school.dao.MainDAO;
import com.school.db.School;

/**
 * @author shiva
 *
 */
public class MainDAOImpl implements MainDAO {
	
	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
	@Override
	public School getSchoolDetails() {
		Session session = this.sessionFactory.getCurrentSession();
		School school = (School) session.createQuery("from School").uniqueResult();
		return school;
	}


}
