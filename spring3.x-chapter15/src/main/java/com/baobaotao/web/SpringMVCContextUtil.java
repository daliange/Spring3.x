package com.baobaotao.web;

import org.springframework.beans.BeansException;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.ApplicationContextAware;  
import org.springframework.stereotype.Component; 

@Component
public class SpringMVCContextUtil implements ApplicationContextAware {
	
	private static ApplicationContext applicationContext;//spring上下文  
    
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {  
        SpringMVCContextUtil.applicationContext=applicationContext;  
    }  
    
    public static ApplicationContext getApplicationContext(){  
        return applicationContext;  
    }  
  
    public static <T> T getBean(String name) throws BeansException{  
           return (T)applicationContext.getBean(name);  
    } 

}
