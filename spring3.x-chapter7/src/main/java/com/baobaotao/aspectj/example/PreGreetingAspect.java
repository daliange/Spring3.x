package com.baobaotao.aspectj.example;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**定义一个切面**/
@Aspect
public class PreGreetingAspect{
	
	/**定义切点、增强类型、增强逻辑**/
	//TODO @Before的入参
	@Before("execution(* greetTo(..))")
	public void beforeGreeting(){
		System.out.println("How are you");
	}
}
