package com.baobaotao;

import com.baobaotao.anno.NeedTestAnno;

public class NaughtyWaiter implements Waiter {
	
	@NeedTestAnno
	public void greetTo(String clientName) {
		System.out.println("NaughtyWaiter:greet to "+clientName+"...");
	}	
	
	@NeedTestAnno
	public void serveTo(String clientName){
		System.out.println("NaughtyWaiter:serving "+clientName+"...");
	}
	public void joke(String clientName,int times){
        	System.out.println("NaughtyWaiter:play "+times+" jokes to "+clientName+"...");
	}
}
