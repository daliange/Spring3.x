package com.baobaotao.proxysimple;

import java.lang.reflect.Proxy;

import com.baobaotao.proxysimple.ForumService;
import com.baobaotao.proxysimple.ForumServiceCglibProxy;
import com.baobaotao.proxysimple.ForumServiceImpl;
import com.baobaotao.proxysimple.ForumServiceInvocationHandler;

public class TestProxySimple {
	public static void main(String[] args) {
		// 业务类正常编码的测试
//		 ForumService forumService = new ForumServiceImpl();
//		 forumService.removeForum(10);
//		 forumService.removeTopic(1012);

		// 使用JDK动态代理
		/**1、target希望被代理的目标业务类**/
		ForumService target = new ForumServiceImpl();
		/**2、将 目标业务类 与 横切代码 进行编织**/
		ForumServiceInvocationHandler handler = new ForumServiceInvocationHandler(target);
		/**3、根据目标业务类 与 InvocationHandler 创建代理实例**/
		ForumService proxy = (ForumService) Proxy.newProxyInstance(
				target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), 
				handler);
		/**4、调用代理实例**/
		proxy.removeForum(10);
		//proxy.removeTopic(1012);
		
		//使用CGLib动态代理
		ForumServiceCglibProxy forumServiceCglibProxy = new ForumServiceCglibProxy();
		/**通过动态生成子类的方式创建代理**/
		ForumService forumService = (ForumService)forumServiceCglibProxy.getProxy(ForumServiceImpl.class);
		forumService.removeForum(10);
		//forumService.removeTopic(1023);
		
	}
}
