package com.school.dao;

import java.util.List;

import com.school.db.User;

public interface LoginDAO {

	/**
	 * 
	 * @return
	 */
	public List<User> list();

	/**
	 * 
	 * @param userName
	 * @param password
	 * @param domain
	 * @return
	 */
	public boolean validateUser(String userName, String password, String domain);

}
