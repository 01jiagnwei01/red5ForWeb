package com.gxkj.red5;

import org.red5.server.scope.WebScope;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.context.ServletContextAware;

public class ServletWebScope extends WebScope implements ServletContextAware,InitializingBean{

	public void register() {
		super.register();
	}
}
