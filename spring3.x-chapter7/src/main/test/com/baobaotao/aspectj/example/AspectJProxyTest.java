package com.baobaotao.aspectj.example;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

import com.baobaotao.NaiveWaiter;
import com.baobaotao.Waiter;

public class AspectJProxyTest {
	public static void main(String[] args) {
		Waiter target = new NaiveWaiter();
		
		/**AspectJ的代理类工厂**/
		AspectJProxyFactory factory = new AspectJProxyFactory();
		/**代理目标**/
		factory.setTarget(target);
		/**代理切面**/
		factory.addAspect(PreGreetingAspect.class);
		
		Waiter proxy = factory.getProxy();
		
		proxy.greetTo("John");
		proxy.serveTo("John");
	}
}
