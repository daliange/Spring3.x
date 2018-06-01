package com.baobaotao.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

public class MailSendEvent extends ApplicationContextEvent {
	private String msg;
	
	public MailSendEvent(ApplicationContext source, String msg) {
		super(source);
		this.msg = msg;
	}
	public String getMsg() {
		return this.msg;
	}
}
