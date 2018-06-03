package com.baobaotao.threadsync;


public class SequenceNumber {
	
	private static int seqnum =0;
	
	/**获取下一个序号
	 * @throws InterruptedException **/
	public synchronized int getNextNum() throws InterruptedException{
		System.out.println(Thread.currentThread().getName()+"+1之前："+seqnum);
		seqnum = seqnum +1;
		System.out.println(Thread.currentThread().getName()+"+1之后："+seqnum);
		Thread.currentThread().sleep(100);
		System.out.println(Thread.currentThread().getName()+"睡醒之后："+seqnum);
		return seqnum;
	}

	public static int getSeqnum() {
		return seqnum;
	}

	public static void setSeqnum(int seqnum) {
		SequenceNumber.seqnum = seqnum;
	}
	
	
	
	
	

}
