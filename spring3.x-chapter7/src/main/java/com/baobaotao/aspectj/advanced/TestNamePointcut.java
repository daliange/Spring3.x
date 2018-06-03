package com.baobaotao.aspectj.advanced;

import org.aspectj.lang.annotation.Pointcut;

public class TestNamePointcut {
	
	/**切点命名 @Pointcut**/
	@Pointcut("within(com.baobaotao.*)")
	private void inPackage(){}
//	
//	@Pointcut("execution(* greetTo(..)))")
//    protected void greetTo(){}
//
    @Pointcut("inPackage() and greetTo()")
    public void inPkgGreetTo(){}
}
