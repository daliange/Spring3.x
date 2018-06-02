package com.baobaotao.proxysimple;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ForumServiceCglibProxy implements MethodInterceptor {
	
	private Enhancer enhancer = new Enhancer();

	/**创建动态代理对象**/
	public Object getProxy(Class clazz) {
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
	/**拦截父类所有方法的调用**/
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		System.out.println("Cglib开始：MethodProxy="+proxy+","+obj.getClass().getName()+","+ method.getName()+","+args[0]);
		Object result=proxy.invokeSuper(obj, args);
		System.out.println("Cglib结束");
		return result;
	}
}
