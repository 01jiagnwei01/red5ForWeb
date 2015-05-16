package demo.quartz;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.impl.calendar.HolidayCalendar;

public class CalendarQuartzTest {

	public static void main(String[] args) {
		
		SchedulerFactory schedFact = new org.quartz.impl.StdSchedulerFactory(); 
		  Scheduler sched = schedFact.getScheduler(); 
		  sched.start(); 
		  
		HolidayCalendar cal = new HolidayCalendar();    
		/**
		 * 添加需要排除的日期
		 */
//		cal.addExcludedDate( someDate );    
//		cal.addExcludedDate( someOtherDate );    
		//sched.addCalendar(calName, calendar, replace, updateTriggers);
		sched.addCalendar("myHolidays", cal, false,false);    
		Trigger t = newTrigger()    
		    .withIdentity("myTrigger")    
		    .forJob("myJob")    
		    .withSchedule(dailyAtHourAndMinute(9, 30)) // execute job daily at 9:30    
		    .modifiedByCalendar("myHolidays") // but not on holidays    
		    .build();    
		// .. schedule job with trigger    
		Trigger t2 = newTrigger()    
		    .withIdentity("myTrigger2")    
		    .forJob("myJob2")    
		    .withSchedule(dailyAtHourAndMinute(11, 30)) // execute job daily at 11:30    
		    .modifiedByCalendar("myHolidays") // but not on holidays    
		    .build();    
		// .. schedule job with trigger2

	}
	public Trigger dailyAtHourAndMinute(long hour ,long minute){
		return null;
	}

}
