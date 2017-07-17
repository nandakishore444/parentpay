/**
 * 
 */
package com.school.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.school.dao.MainDAO;
import com.school.db.School;
import com.school.service.MainService;
import com.school.value.MainVO;

/**
 * @author shiva
 *
 */
@Service("mainService")
@Transactional
public class MainServiceImpl implements MainService{
	
	@Autowired
	private MainDAO mainDAO;
	
	
	@Override
	public MainVO getHomeDetails(){

		School school = mainDAO.getSchoolDetails();
		MainVO mainVO = new MainVO();
		Map<String, String> domains = new HashMap<String, String>();
		domains.put("Parent", "Parent");
		domains.put("Employee", "Employee");
		domains.put("Vendor", "Venodor");
		domains.put("Admin", "Admin");
		mainVO.setDomains(domains);
		mainVO.setSchoolName(school.getSchoolName());
		return mainVO;
	}

}
