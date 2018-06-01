package com.baobaotao.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicatonEventTest {

	public static void main(String[] args) {
		String resourceFile = "com/baobaotao/event/beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resourceFile);	
		MailSender mailSender = ctx.getBean("mailSender",MailSender.class);
		mailSender.sendMail("li.jie");
	    System.out.println("done.");
	}
}
