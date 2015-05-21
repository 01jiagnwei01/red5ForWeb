package com.gxkj.red5.listeners;

import java.io.File;

import javax.servlet.ServletContextEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.ContextLoaderListener;

public class Red5InitListener extends ContextLoaderListener  {
 
	protected final  Logger logger = LoggerFactory.getLogger(getClass());

 
	public void contextInitialized(ServletContextEvent sce) {
		File dir = new File(this.getClass().getResource("").getPath()); 
		String dirAbsoultePath = dir.getAbsolutePath();
		String classes = "classes";
		String classpath = dirAbsoultePath.substring(0, dirAbsoultePath.indexOf(classes)+classes.length());
		 
		 System.setProperty("red5.root",classpath);
		 System.setProperty("red5.config_root",String.format("%s/%s", classpath,"conf"));
		 System.out.println(System.getProperty("red5.config_root"));
		
	}
 
	public void contextDestroyed(ServletContextEvent sce) {
	 
		
	}   

	
	 
}
