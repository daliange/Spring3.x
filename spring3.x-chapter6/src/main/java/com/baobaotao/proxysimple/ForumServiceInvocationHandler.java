package com.baobaotao.proxysimple;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ForumServiceInvocationHandler implements InvocationHandler {
    private Object target;
	public ForumServiceInvocationHandler(Object target){
		this.target = target;
	}
	
	/**实现目标业务的所有接口**/
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("jdk动态代理开始："+target.getClass().getName()+","+ method.getName()+","+args[0]);
		Object obj = method.invoke(target, args);
		System.out.println("jdk动态代理结束");
		return obj;
	}
	


}
