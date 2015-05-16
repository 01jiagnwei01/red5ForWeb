package demo.quartz;

import java.util.ArrayList;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;
/**
 * 第二种传参方式：
 *		使用setter方法 	
 *
 */
public class DumbJob implements Job {
	String jobSays;      
    float myFloatValue;      
  
 
	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		JobKey key = context.getJobDetail().getKey();      
	      JobDataMap dataMap = context.getMergedJobDataMap(); 
	       // Note the difference from the previous example      
	     // state.add(new Date());      
	      System.err.println("第二种传参方法Instance " + key + " of DumbJob says: " 
	           + jobSays + ", and val is: " + myFloatValue); 

	}

	public String getJobSays() {
		return jobSays;
	}

	public void setJobSays(String jobSays) {
		this.jobSays = jobSays;
	}

	public float getMyFloatValue() {
		return myFloatValue;
	}

	public void setMyFloatValue(float myFloatValue) {
		this.myFloatValue = myFloatValue;
	}

	
	

}
