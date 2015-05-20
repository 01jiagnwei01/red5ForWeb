package demo.quartz.myexample1;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

import java.util.Calendar;
import java.util.Date;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

public class SimpleExample {

	public static void main(String[] args) throws SchedulerException, InterruptedException {

		SchedulerFactory sf = new StdSchedulerFactory();   
		Scheduler sched = sf.getScheduler();
		
		
		// define the job and tie it to our HelloJob class   
		JobDetail job = newJob(HelloJob.class)   
		    .withIdentity("job1", "group1")   
		    .build();
		
		Calendar calendar = Calendar.getInstance();
		//calendar.set(Calendar.HOUR, 0);
		calendar.set(Calendar.MINUTE, 19);
		calendar.set(Calendar.SECOND, 0);
		// compute a time that is on the next round minute   
		Date runTime =  calendar.getTime() ;   
		// Trigger the job to run on the next round minute   
		Trigger trigger = newTrigger()   
		    .withIdentity("trigger1", "group1")   
		    .startAt(runTime)   
		    .build();

		//We now will associate the job to the trigger in the scheduler:
		// Tell quartz to schedule the job using our trigger   
		sched.scheduleJob(job, trigger);
		sched.start();
		
		Thread.sleep(90L * 1000L);
		
		
		
		sched.shutdown(true);

	}

}
