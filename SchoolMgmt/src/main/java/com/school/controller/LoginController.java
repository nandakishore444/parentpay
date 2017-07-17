/**
 * 
 */
package com.school.controller;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author shiva
 *
 */

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.school.service.LoginService;
import com.school.value.LoginVO;
import com.school.value.MainVO;
import com.school.value.ValueObject;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView hello(@ModelAttribute("main") MainVO mainVO, BindingResult result) {

		ModelAndView model = new ModelAndView();
		ValueObject vo = loginService.getUsers(mainVO);
		if(vo.getErrorMessage() != null && !"".equalsIgnoreCase(vo.getErrorMessage().trim())){
			model.setViewName("Login");
			model.addObject((MainVO)vo);
		}else{
			model.setViewName("Admin");
			model.addObject((LoginVO)vo);
		}
		return model;

	}
}