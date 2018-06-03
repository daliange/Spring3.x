package com.baobaotao.threadsync;

public class ThreadSyncTest {
	
	public static void main(String[] args) {
		
		SequenceNumber sn = new SequenceNumber();
		
		NumThread thread1 = new NumThread(sn);
		NumThread thread2 = new NumThread(sn);
		NumThread thread3 = new NumThread(sn);
		
		thread1.setName("Thread-A");
		thread2.setName("Thread-B");
		thread3.setName("Thread-C");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
