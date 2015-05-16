package demo.quartz;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;

public class QuartzTest {
	public static void main(String[] args) throws SchedulerException {
		
		SchedulerFactory schedFact = new org.quartz.impl.StdSchedulerFactory(); 
		  Scheduler sched = schedFact.getScheduler(); 
		  sched.start(); 
		  
		// define the job and tie it to our HelloJob class 
//		  JobDetail job = newJob(HelloJob.class) 
//			      .withIdentity("myJob", "group1") // name "myJob", group "group1" 
//			      //传参，参数必须实现序列化
//			      .usingJobData("jobSays", "Hello World!")      
//			      .usingJobData("myFloatValue", 3.141f)   
//			      .build(); 
//		        
//		// Trigger the job to run now, and then repeat every 40 seconds 
//		Trigger trigger = newTrigger() 
//		    .withIdentity("trigger1", "group1") 
//		    .startNow() 
//		    .withSchedule(simpleSchedule() 
//		            .withIntervalInSeconds(40) 
//		            .repeatForever())            
//		    .build(); 
//		        
//		 
//		// Tell quartz to schedule the job using our trigger 
//		 sched.scheduleJob(job, trigger);
//		 
//		 
//		 
//		 
		 Trigger trigger2 = newTrigger() 
				    .withIdentity("trigger1", "group2") 
				    .startNow() 
				    .withSchedule(simpleSchedule() 
				            .withIntervalInSeconds(40) 
				            .repeatForever())            
				    .build(); 
				        
		JobDetail job2 = newJob(DumbJob.class) 
					      .withIdentity("myJob2", "group2") // name "myJob", group "group1" 
					      //传参，参数必须实现序列化
					      .usingJobData("jobSays", "Hello World 2!")      
					      .usingJobData("myFloatValue", 3.142f)   
					      .build();
				 
		 sched.scheduleJob(job2, trigger2);
		 
		
	}

}
