package com.baobaotao.anno;

public class LijieService {
	
	@LijieAnnot
	public String eat() {
		System.out.println("------------eat");
		return "eat";
	}
	
	@LijieAnnot(LijieEnum.B)
	public String learn() {
		System.out.println("------------learn");
		return "learn";
	}
	
	@LijieAnnot(LijieEnum.C)
	public String sleep() {
		System.out.println("------------sleep");
		return "sleep";
	}

}
