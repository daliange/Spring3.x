package com.baobaotao.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.baobaotao.Car;

/**
 * PathMatchingResourcePatternResolver
 * XmlBeanFactory
 * **/
public class BeanFactoryTest {
	public static void main(String[] args) throws Throwable{
	   ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
	   Resource res = resolver.getResource("classpath:com/baobaotao/beanfactory/beans.xml");
	   System.out.println("res.getURL()="+res.getURL());
       BeanFactory bf = new XmlBeanFactory(res);
       System.out.println("=====init BeanFactory.");
       
       Car car1 = bf.getBean("car",Car.class);
       System.out.println("=====car bean is ready for use!");
       car1.introduce();
       car1.setBrand("大众");
       
       Car car2 = bf.getBean("car",Car.class);
       System.out.println("car2.getBrand()="+car2.getBrand());
       if(car1==car2){
    	   System.out.println("car1==car2");
       }else{
    	   System.out.println("car1!=car2");
       }
       
      
	}
}
