
package com.baobaotao.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class ReflectTest {
  
	public static Car  initByDefaultConst() throws Throwable
	{
		/**获取类加载器**/
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		/**获取Class类**/
		//Class clazz = loader.loadClass("com.baobaotao.reflect.Car");
		Class clazz = Class.forName("com.baobaotao.reflect.Car");
		
		/**获取类的构造函数**/
		/**获取默认构造函数**/
		Constructor cons = clazz.getDeclaredConstructor((Class[])null);
		/**根据构造函数新建Class实例**/
		Car car = (Car)cons.newInstance();
		
		/**根据方法名、参数获取方法**/
		Method setBrand = clazz.getMethod("setBrand",String.class);		
		setBrand.invoke(car,"红旗CA72");		
		Method setColor = clazz.getMethod("setColor",String.class);
		setColor.invoke(car,"黑色");		
		Method setMaxSpeed = clazz.getMethod("setMaxSpeed",int.class);
		setMaxSpeed.invoke(car,200);	
		
		/**获取属性**/
		Field brand = clazz.getDeclaredField("brand");
		/**将brand设置为可访问的**/
		brand.setAccessible(true);
		brand.set(car, "红旗CA72====");
		return car;
	}
	
	public static Car initByParamConst()  throws Throwable{
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Class clazz = loader.loadClass("com.baobaotao.reflect.Car");
		/**获取带参数的构造函数**/
		Constructor cons = clazz.getDeclaredConstructor(new Class[]{String.class,String.class,int.class});
		Car car = (Car)cons.newInstance(new Object[]{"吉利TOPMIX","绿色",120});
		return car;	
	}
	
	public static void main(String[] args) throws Throwable {
		Car car1 = initByDefaultConst();
		Car car2 = initByParamConst();
		car1.introduce();
		car2.introduce();
	}
}
