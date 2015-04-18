package com.gxkj.red5.listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class Red5InitListener extends ContextLoaderListener{

	protected final  Logger logger = LoggerFactory.getLogger(getClass());   

	
	/**
	 * spring上下文环境  
	 */
	private static WebApplicationContext applicationContext;

	/**
	 * servlet上下文环境
	 */
	private static ServletContext servletContext;
	
	public void contextDestroyed(ServletContextEvent event) {
		
		 
		   
	}

	public void contextInitialized(ServletContextEvent event) {
		super.contextInitialized(event);
		servletContext = event.getServletContext();
		applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
		   
	}
}
