package com.gxkj.red5.listeners;

import java.io.File;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Red5InitListener extends HttpServlet implements ServletContextListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2227351068264248685L;
	protected final  Logger logger = LoggerFactory.getLogger(getClass());

 
	public void contextInitialized(ServletContextEvent sce) {
		File dir = new File(this.getClass().getResource("").getPath()); 
		String dirAbsoultePath = dir.getAbsolutePath();
		String classes = "classes";
		String classpath = dirAbsoultePath.substring(0, dirAbsoultePath.indexOf(classes)+classes.length());
		 System.out.println(dirAbsoultePath);
		 System.out.println(classpath);
		 System.setProperty("red5.root",classpath);
		
	}
 
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}   

	
	 
}
