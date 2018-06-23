package com.baobaotao.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.baobaotao.domain.User;
import com.baobaotao.service.UserService;
import com.baobaotao.springcontext.SpringContextUtil;

/**web应用获取ApplicationContext**/
@Controller
@RequestMapping("/applicationcontext")
public class ApplicationContextController {
	
	Logger logger = LoggerFactory.getLogger(ApplicationContextController.class);
	
	@RequestMapping("/getapplicationcontext")
	public String getApplicationContext(HttpServletRequest request,HttpServletResponse response){
		System.out.println("/getapplicationcontext");
		//1、通过WebApplicationContextUtils获取ApplicationContext
		//WebApplicationContext wa =WebApplicationContextUtils.getRequiredWebApplicationContext(request.getServletContext());
		System.out.println("1、通过WebApplicationContextUtils获取ApplicationContext");
		WebApplicationContext wa =WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
		UserService us = (UserService)wa.getBean("userService");
		us.createUser(new User());
		System.out.println("wa.getApplicationName()="+wa.getApplicationName()+",ID="+wa.getId());
		System.out.println("WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE="+WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
		
		//2、通过实现ApplicationContextAware获取ApplicationContext
		System.out.println("2、通过实现ApplicationContextAware获取ApplicationContext");
		ApplicationContext ac = SpringContextUtil.getApplicationContext();
		UserService us1 = (UserService)ac.getBean("userService");
		us1.createUser(new User());
		System.out.println("ac.getApplicationName()="+ac.getApplicationName()+",ID="+ac.getId());
		
		//3、通过实现ApplicationContextAware获取mvc的ApplicationContext
		System.out.println("3、通过实现ApplicationContextAware获取mvc的ApplicationContext");
		ApplicationContext springMVCContext = SpringMVCContextUtil.getApplicationContext();
		UserService us2 = (UserService)springMVCContext.getBean("userService");
		us2.createUser(new User());
		System.out.println("springMVCContext.getApplicationName()="+springMVCContext.getApplicationName()+",ID="+springMVCContext.getId());
		System.out.println("springMVCContext.getParent().getApplicationName()="
		+springMVCContext.getParent().getApplicationName()
		+",ID="+springMVCContext.getParent().getId());
		
		//4、通过RequestContextUtils获取mvc的ApplicationContext
		System.out.println("4、通过RequestContextUtils获取mvc的ApplicationContext");
		WebApplicationContext springMVCContext2 = RequestContextUtils.getWebApplicationContext(request);
		UserService us3 = (UserService)ac.getBean("userService");
		us3.createUser(new User());
		System.out.println("springMVCContext.getApplicationName()="+springMVCContext2.getApplicationName()+",ID="+springMVCContext2.getId());
		System.out.println("springMVCContext.getParent().getApplicationName()="
		+springMVCContext2.getParent().getApplicationName()
		+",ID="+springMVCContext2.getParent().getId());
		
		
		return null;
	}

}
