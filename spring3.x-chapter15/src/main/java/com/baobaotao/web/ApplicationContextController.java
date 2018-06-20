package com.baobaotao.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.baobaotao.UserService;
import com.baobaotao.domain.User;

/**web应用获取ApplicationContext**/
@Controller
@RequestMapping("/applicationcontext")
public class ApplicationContextController {
	
	Logger logger = LoggerFactory.getLogger(ApplicationContextController.class);
	
	/**1、WebApplicationContextUtils.getWebApplicationContext获取WebApplicationContext**/
	@RequestMapping("/getapplicationcontext")
	public String getApplicationContext(HttpServletRequest request,HttpServletResponse response){
		logger.info("/getapplicationcontext");
		System.out.println("/getapplicationcontext");
		//WebApplicationContext wa =WebApplicationContextUtils.getRequiredWebApplicationContext(request.getServletContext());
		WebApplicationContext wa =WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
		UserService us = (UserService)wa.getBean("userService");
		us.createUser(new User());
		return null;
	}

}
