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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.school.service.MainService;
import com.school.value.MainVO;

@Controller
public class MainController {

	@Autowired
	private MainService mainService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView hello() {

		ModelAndView model = new ModelAndView();
		MainVO homeVO = mainService.getHomeDetails();
		model.setViewName("index");
		model.addObject("main", homeVO);
		return model;

	}
	
	@RequestMapping(value = "/loginPage", method = RequestMethod.GET)
	public ModelAndView getLoginPage(@RequestParam(value="domain") final String domain) {

		ModelAndView model = new ModelAndView();
		MainVO homeVO = mainService.getHomeDetails();
		model.setViewName("Login");
		model.addObject("main", homeVO);
		return model;

	}
}