package com.baobaotao.advice;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class TestBeforeAdvice {
	public static void main(String[] args) {
        Waiter target = new NaiveWaiter();
        BeforeAdvice  advice = new GreetingBeforeAdvice();
        
        /**Spring提供的代理工厂**/
        ProxyFactory pf = new ProxyFactory();
        //指定接口进行代理，将使用jdk代理
        pf.setInterfaces(target.getClass().getInterfaces());
        //指定代理优化，将使用cglib代理
        pf.setOptimize(true);
        /**代理目标**/
        pf.setTarget(target);
        /**增强方法**/
        pf.addAdvice(advice);
        
        /**生成代理实例**/
        Waiter proxy = (Waiter)pf.getProxy(); 
        proxy.greetTo("John");
        proxy.serveTo("Tom");
	}
}
