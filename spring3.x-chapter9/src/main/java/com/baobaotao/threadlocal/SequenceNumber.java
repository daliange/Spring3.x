package com.baobaotao.threadlocal;


public class SequenceNumber {
	
	private static ThreadLocal<Integer> seqnum = new ThreadLocal<Integer>(){
		@Override
		public Integer initialValue(){
			return 0;
		}
	};
	
	/**获取下一个序号**/
	public int getNextNum(){
		int i = seqnum.get()+1;
		seqnum.set(i);
		return i;
	}
	
	
	

}
