package com.baobaotao.threadlocal;

public class NumThread extends Thread{
	
	private SequenceNumber sn;
	public NumThread(SequenceNumber sn) {
		this.sn = sn;
	}
	
	/**每个线程打印出3个序号**/
	@Override
	public void run() {
		for(int i=1; i<=3; i++)
			System.out.println(Thread.currentThread().getName()+"==="+sn.getNextNum());
		
	}

}
