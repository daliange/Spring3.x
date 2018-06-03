package com.baobaotao.anno;

import java.lang.reflect.Method;

public class LijieAnnoTest {
	
	public static void main(String[] args) {

		Class clazz = LijieService.class;
		Method[] methodslist = clazz.getMethods();
		for( Method method : methodslist ){
			System.out.println(method.getName());
			LijieAnnot lijieAnnot  = method.getAnnotation(LijieAnnot.class);
			if(lijieAnnot!=null){
				System.out.println("LijieEnum."+lijieAnnot.value());
			}else{
				System.out.println("null");
			}
			
			System.out.println("====================");
			
		}

	
	}

}
