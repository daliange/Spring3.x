package com.baobaotao.attr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestParentContainerBean {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext pFactory = new ClassPathXmlApplicationContext(
				new String[]{"com/baobaotao/attr/beans1.xml"});
		
		/**ApplicationContext加载父类的ApplicationContext，这样使用很少**/
		ApplicationContext factory = new ClassPathXmlApplicationContext(
		new String[]{"com/baobaotao/attr/beans2.xml"},pFactory);
		Boss boss = (Boss)factory.getBean("boss");
		System.out.println(boss.getCar().toString());
	}
}
