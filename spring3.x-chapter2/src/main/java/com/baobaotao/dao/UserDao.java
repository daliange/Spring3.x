package com.baobaotao.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.baobaotao.domain.User;

/**Spring注解定义DAO**/
@Repository
public class UserDao {
	
	/**自动注入jdbcTemplate**/
	@Autowired
	private JdbcTemplate jdbcTemplate;


	/**获取应户名，密码匹配数**/
	public int getMatchCount(String userName, String password) {
		String sqlStr = " SELECT count(*) FROM t_user "
				+ " WHERE user_name =? and password=? ";
		System.out.println(sqlStr);
		return jdbcTemplate.queryForInt(sqlStr, new Object[] { userName, password });
		
		/**
		 * 测试sql注入
		 * 当页面输入密码：1' or '1'='1，典型sql注入
		 * SELECT count(*) FROM t_user  WHERE user_name = 'admin' and password= '1' or '1'='1'
		 * **/
//		String sqlStr = " SELECT count(*) FROM t_user "
//				+ " WHERE user_name = '"+userName+"' and password= '"+password+"'";
//		System.out.println(sqlStr);
//		return jdbcTemplate.queryForInt(sqlStr);
	}

	public User findUserByUserName(final String userName) {
		String sqlStr = " SELECT user_id,user_name,credits "
				+ " FROM t_user WHERE user_name =? ";
		final User user = new User();
		jdbcTemplate.query(sqlStr, new Object[] { userName },
				/**查询结果的处理回调接口**/
				new RowCallbackHandler() {
					public void processRow(ResultSet rs) throws SQLException {
						user.setUserId(rs.getInt("user_id"));
						user.setUserName(userName);
						user.setCredits(rs.getInt("credits"));
					}
				});
		return user;
	}

	public void updateLoginInfo(User user) {
		String sqlStr = " UPDATE t_user SET last_visit=?,last_ip=?,credits=? "
				+ " WHERE user_id =?";
		jdbcTemplate.update(sqlStr, new Object[] { user.getLastVisit(),
				user.getLastIp(),user.getCredits(),user.getUserId()});
	}
}
