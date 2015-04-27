package com.gxkj.red5.applications;

import org.red5.server.adapter.ApplicationAdapter;
import org.red5.server.api.IConnection;

public class NewTaoBaoApplication extends ApplicationAdapter{
	public boolean appConnect(IConnection conn,Object[] args)
	{
		System.out.println("链接");
		return true;
	}
	
	public String change(String str){
		System.out.println("客户端调用服务器端方法");
		return str.toUpperCase();
	}
}
