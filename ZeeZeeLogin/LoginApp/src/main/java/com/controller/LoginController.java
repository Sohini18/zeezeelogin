package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.bean.LoginBean;
import com.service.LoginService;




public class LoginController {
	
	
	

	public String showLoginpage(LoginBean loginBean) {
	
			return null;

	}


	
	public String checkLoginDetails(LoginBean loginBean, 
			BindingResult result) {
		
	
		return null;

	}
	

}
