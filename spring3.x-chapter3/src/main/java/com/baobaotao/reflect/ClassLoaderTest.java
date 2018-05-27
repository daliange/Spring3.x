package com.baobaotao.reflect;
public class ClassLoaderTest {
	
	public static void main(String[] args) {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		/**当前类加载器AppClassLoader**/
		System.out.println("current loader:"+loader);
		/**父类加载器ExtClassLoader**/
		System.out.println("parent loader:"+loader.getParent());
		System.out.println("grandparent loader:"+loader.getParent().getParent());
	}
}
