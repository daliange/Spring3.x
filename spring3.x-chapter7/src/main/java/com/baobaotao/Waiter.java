package com.baobaotao;

import com.baobaotao.anno.NeedTestAnno;

public interface Waiter {
	@NeedTestAnno
	public void greetTo(String clientName);	
	public void serveTo(String clientName);
}
