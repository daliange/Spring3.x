package com.baobaotao.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	  public static void main(String[] args) {
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("com/baobaotao/scope/beans.xml");
		 
		 /**单例模式**/
		 Car car1 = ctx.getBean("car_singleton",Car.class);
		 Car car2 = ctx.getBean("car_singleton",Car.class);
		 System.out.println("单例模式car1=car2,"+(car1==car2)+","+car1+","+car2);
		 
		 /**多例模式**/
		 Car car3 = ctx.getBean("car_prototype",Car.class);
		 Car car4 = ctx.getBean("car_prototype",Car.class);
		 System.out.println("多例模式car3=car4,"+(car3==car4)+","+car3+","+car4);
		 
		 
		 /**单例引用单例**/
		 Boss boss1 = ctx.getBean("boss_singleton_singleton",Boss.class);
		 Boss boss2 = ctx.getBean("boss_singleton_singleton",Boss.class);
		 System.out.println("单例boss1=boss2,"+(boss1==boss2)+","+boss1+","+boss2);
		 System.out.println("单例引用单例:boss1.car=boss2.car,"+(boss1.getCar()==boss2.getCar())
				 +","+boss1.getCar()+","+boss2.getCar());
		 
		 /**单例引用多例，本身就是单例，不会再去创建多例**/
		 Boss boss3 = ctx.getBean("boss_singleton_prototype",Boss.class);
		 Boss boss4 = ctx.getBean("boss_singleton_prototype",Boss.class);
		 System.out.println("单例boss3=boss4,"+(boss3==boss4)+","+boss3+","+boss4);
		 System.out.println("单例引用多例:boss3.car=boss4.car,"+(boss3.getCar()==boss4.getCar())
				 +","+boss3.getCar()+","+boss4.getCar());
		 
		 /**多例引用单例**/
		 Boss boss5 = ctx.getBean("boss_prototype_singleton",Boss.class);
		 Boss boss6 = ctx.getBean("boss_prototype_singleton",Boss.class);
		 System.out.println("多例boss5=boss6,"+(boss5==boss6)+","+boss5+","+boss6);
		 System.out.println("多例引用单例:boss5.car=boss6.car,"+(boss5.getCar()==boss6.getCar())
				 +","+boss5.getCar()+","+boss6.getCar());
		 
		 /**多例引用多例**/
		 Boss boss7 = ctx.getBean("boss_prototype_prototype",Boss.class);
		 Boss boss8 = ctx.getBean("boss_prototype_prototype",Boss.class);
		 System.out.println("多例boss7=boss8,"+(boss7==boss8)+","+boss7+","+boss8);
		 System.out.println("多例引用多例:boss7.car=boss8.car,"+(boss7.getCar()==boss8.getCar())
				 +","+boss7.getCar()+","+boss8.getCar());
		 
		 
	}
}
