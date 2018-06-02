package com.baobaotao.advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAdviceBySpringXml {
	public static void main(String[] args) {
		String configPath = "com/baobaotao/advice/beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		Waiter waiter = (Waiter)ctx.getBean("waiterProxy");
		waiter.greetTo("John");
		//waiter.serveTo("John");
	}
}
