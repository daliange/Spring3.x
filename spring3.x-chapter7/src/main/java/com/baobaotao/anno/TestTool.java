package com.baobaotao.anno;

import java.lang.reflect.Method;

public class TestTool {

	public static void main(String[] args) throws Exception{
		Class clazz = ForumService.class;
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			NeedTestAnno nt = method.getAnnotation(NeedTestAnno.class);
			if (nt != null) {
				if (nt.value()) {
					System.out.println(method.getName() + "()需要测试");
				} else {
					System.out.println(method.getName() + "()不需要测试");
				}
			}
		}
		
		ClassLoader   classLoader= Thread.currentThread().getContextClassLoader();
		Class clazz1 = classLoader.loadClass("com.baobaotao.anno.ForumService");
	}
}
