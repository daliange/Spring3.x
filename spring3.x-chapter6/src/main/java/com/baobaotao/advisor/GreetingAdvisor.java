package com.baobaotao.advisor;

import java.lang.reflect.Method;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

public class GreetingAdvisor extends StaticMethodMatcherPointcutAdvisor {

	/**切点方法匹配规则：greetTo**/
	public boolean matches(Method method, Class clazz) {
		return "greetTo".equals(method.getName());
	}	
	
	/**切点类匹配规则：Waiter及其子类**/
	public ClassFilter getClassFilter(){
		return new ClassFilter(){
			public boolean matches(Class clazz){
				return Waiter.class.isAssignableFrom(clazz);
			}
		};
		
	}
}
