/**
 * 
 */
package com.school.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.school.dao.LoginDAO;
import com.school.service.LoginService;
import com.school.value.LoginVO;
import com.school.value.MainVO;
import com.school.value.ValueObject;

/**
 * @author shiva
 *
 */
@Service("loginService")
@Transactional
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginDAO loginDAO;
	
	
	@Override
	public ValueObject getUsers(MainVO mainVO){
		LoginVO loginVO = null;
		String userName = mainVO.getUserName();
		String password = mainVO.getPassword();
		String domain = mainVO.getDomain();
		boolean validateUser = loginDAO.validateUser(userName, password, domain);
		validateUser = true;
		if(validateUser){
			loginVO = new LoginVO();
			loginVO.setDomain(mainVO.getDomain());
			loginVO.setUserEmail("shivaa.532@gmail.com");
			loginVO.setUserFullName("Shiva Kumar Perapagu");
			return loginVO;
		}else{
			mainVO.setErrorMessage("Login Failed. Please check the details");
			return mainVO;
		}
	}

}
