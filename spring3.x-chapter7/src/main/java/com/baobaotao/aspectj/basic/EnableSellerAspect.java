package com.baobaotao.aspectj.basic;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

import com.baobaotao.Seller;
import com.baobaotao.SmartSeller;

@Aspect
public class EnableSellerAspect {

	/**
	 * 1、为NaiveWaiter添加接口实现
	 * 2、默认的接口实现类
	 * 3、要实现的目标接口
	 * **/
	@DeclareParents(value = "com.baobaotao.NaiveWaiter", defaultImpl = SmartSeller.class)
	public Seller seller;
}
