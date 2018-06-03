package com.baobaotao.threadsync;

public class NumThread extends Thread{
	
	private SequenceNumber sn;
	public NumThread(SequenceNumber sn) {
		this.sn = sn;
	}
	
	/**每个线程打印出3个序号**/
	@Override
	public void run() {
		for(int i=1; i<=3; i++)
			try {
				sn.getNextNum();
//				System.out.println(Thread.currentThread().getName()
//						+"+1之前："+sn.getSeqnum()+",+1之后："+sn.getNextNum());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}

}
