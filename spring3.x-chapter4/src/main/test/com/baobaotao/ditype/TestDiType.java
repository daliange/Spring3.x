package com.baobaotao.ditype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class TestDiType extends TestCase {
	public ApplicationContext factory = null;

	private static String[] CONFIG_FILES = { "com/baobaotao/ditype/beans.xml" };

	public void setUp() throws Exception {
		factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
	}
	
	public void testCar(){
		Car car = (Car)factory.getBean("car");
		assertNotNull(car);
		System.out.println(car);
	}
	public void testCar1(){
		Car car1 = (Car)factory.getBean("car1");
		assertNotNull(car1);
		System.out.println(car1);
	}	
//	public void testCar2(){
//		Car car2 = (Car)factory.getBean("car2");
//		assertNotNull(car2);
//		System.out.println(car2);
//	}
	public void testCar3(){
		Car car3 = (Car)factory.getBean("car3");
		assertNotNull(car3);
		System.out.println("car3:"+car3);
	}
	
	public void testCar4(){
		Car car4 = (Car)factory.getBean("car4");
		assertNotNull(car4);
		System.out.println("car4:"+car4);
	}
	
	public void testCar5(){
		Car car5 = (Car)factory.getBean("car5");
		assertNotNull(car5);
		System.out.println("car5:"+car5);
	}	
	
	public void testCar6(){
		Car car6 = (Car)factory.getBean("car6");
		assertNotNull(car6);
		System.out.println("car6:"+car6);
	}	
	public void testBoss(){
		Boss boss = (Boss)factory.getBean("boss");
		assertNotNull(boss);
		System.out.println("boss:"+boss);
	}	
	public void testBoss2(){
		Boss boss2 = (Boss)factory.getBean("boss2");
		assertNotNull(boss2);
		System.out.println("boss2:"+boss2);
	}	
}
