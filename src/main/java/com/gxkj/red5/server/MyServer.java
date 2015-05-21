package com.gxkj.red5.server;

import org.red5.server.Server;

public class MyServer extends Server{

	public void afterPropertiesSet() throws Exception {
//		Server.schedulingService = (QuartzSchedulingService) applicationContext.getBean("schedulingService");
		super.afterPropertiesSet();
	}
}
