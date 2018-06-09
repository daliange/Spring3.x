package com.baobaotao.basic.executor;

public class RunnableImpl implements Runnable {

	public void run() {
		System.out.println("执行的线程===="+Thread.currentThread().getId());
	}

}
