package com.baobaotao.event;

import org.springframework.context.ApplicationListener;

public class MailSendListener implements ApplicationListener<MailSendEvent>{

	public void onApplicationEvent(MailSendEvent event) {
			MailSendEvent mse = (MailSendEvent) event;
			System.out.println("MailSendListener:向" + mse.getMsg() + "发送完一封邮件");
	}
}
