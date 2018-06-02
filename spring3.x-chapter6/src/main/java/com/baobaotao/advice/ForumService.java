package com.baobaotao.advice;

import java.io.Serializable;
import java.sql.SQLException;

public class ForumService {
	public void removeForum(int forumId) {
		// do sth...执行方法报错
		throw new RuntimeException("运行异常。");
	}
	public void updateForum(Forum forum) throws Exception{
		// do sth...执行方法报错
		throw new SQLException("数据更新操作异常。");
		
	}
}
