package com.baobaotao.basic.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorsTest {
	
	public static void main(String[] args) {
		Executor executor = Executors.newFixedThreadPool(3);
		for(int i =1; i<=10 ;i++){
			executor.execute(new RunnableImpl());
		}
		
	}
}
