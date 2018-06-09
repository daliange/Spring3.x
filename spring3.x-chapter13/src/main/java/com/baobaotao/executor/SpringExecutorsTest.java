package com.baobaotao.executor;


import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.SyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ConcurrentTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

public class SpringExecutorsTest {
	
	public static void main(String[] args) {
		/**SimpleAsyncTaskExecutor没有使用线程池，每次都创建新的线程，但支持对线程总数设置**/
//		SimpleAsyncTaskExecutor  simpleAsyncTaskExecutor = new SimpleAsyncTaskExecutor();
//		simpleAsyncTaskExecutor.setConcurrencyLimit(2);
//		TaskExecutor executor = simpleAsyncTaskExecutor;
		
		/**SyncTaskExecutor,非异步执行，在当前线程中执行**/
		TaskExecutor executor = new SyncTaskExecutor();
		
		for(int i =1; i<=10 ;i++){
			executor.execute(new RunnableImpl());
		}
		
	}
}
