package com.gxkj.red5.listeners;

import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.gxkj.red5.enums.Red5DeploymentTypes;

public class Red5InitListener extends ContextLoaderListener  {
 
	protected final  Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * spring上下文环境  
	 */
	private static WebApplicationContext applicationContext;

	/**
	 * servlet上下文环境
	 */
	private static ServletContext servletContext;

	
 
	public void contextInitialized(ServletContextEvent event) {
		File dir = new File(this.getClass().getResource("").getPath()); 
		String dirAbsoultePath = dir.getAbsolutePath();
		String classes = "classes";
		String classpath = dirAbsoultePath.substring(0, dirAbsoultePath.indexOf(classes)+classes.length());
		
		servletContext = event.getServletContext();
		String prefix = servletContext.getRealPath("/");
		 
		 System.setProperty("red5.root",classpath);
		 System.setProperty("red5.config_root",String.format("%s/%s", classpath,"red5"));
		 System.setProperty("red5.deployment.type",Red5DeploymentTypes.war.toString());
		 
		 System.setProperty("red5.webapp.root",prefix);
		 
		 logger.info("set red5.root:{}",classpath);
		 logger.info("set red5.config_root:{}", System.getProperty("red5.config_root"));
		 
	
		 
		 super.contextInitialized(event);
		servletContext = event.getServletContext();
		applicationContext = WebApplicationContextUtils
				.getRequiredWebApplicationContext(servletContext);
		
	}
 
	public void contextDestroyed(ServletContextEvent sce) {
	 
		
	}   
	/**
	 * @return the applicationContext
	 */
	public static WebApplicationContext getApplicationContext() {
		return applicationContext;
	}

	/**
	 * @param applicationContext
	 *            the applicationContext to set
	 */
	public static void setApplicationContext(WebApplicationContext applicationContext) {
		Red5InitListener.applicationContext = applicationContext;
	}

	/**
	 * @return the servletContext
	 */
	public static ServletContext getServletContext() {
		return servletContext;
	}

	/**
	 * @param servletContext
	 *            the servletContext to set
	 */
	public static void setServletContext(ServletContext servletContext) {
		Red5InitListener.servletContext = servletContext;
	}

	public static Object getBean(String beanName) {
		 
		if(applicationContext==null){
			 System.out.println("异常：applicationContext为空");
			return null;
		}
		if(!applicationContext.containsBean(beanName)){
			 System.out.println("异常：applicationContext中没有beanName="+beanName);
				return null;
		}
		 
		return applicationContext.getBean(beanName);
	}
	
	 
}
