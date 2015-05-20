package demo.quartz;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloJob implements Job{

	protected final  Logger logger = LoggerFactory.getLogger(getClass());
	
	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		System.out.println(" hello , i am do work");
		//接参数
		JobKey key = context.getJobDetail().getKey();      
	      JobDataMap dataMap = context.getJobDetail().getJobDataMap();      
	      String jobSays = dataMap.getString("jobSays");      
	      float myFloatValue = dataMap.getFloat("myFloatValue");      
	      System.err.println("Instance " + key + " of DumbJob says: " 
	            + jobSays + ", and val is: " + myFloatValue);  
		
	}

}
