quartz参考网址
http://www.quartz-scheduler.org/generated/2.2.1/html/qs-all/

1 quartz.properties 必须放到根目录下
2注意：
 2.1：如果使用StdSchedulerFactory.getDefaultScheduler()获得scheduler对象，我们的应用将不会终止，
 除非使用 scheduler.shutdown()来停止。这是因为这将激活线程。
 
 3:开发指南
 http://www.quartz-scheduler.org/generated/2.2.1/html/qs-all/#page/Quartz_Scheduler_Documentation_Set%2F_qs_all.1.009.html
 
 注意：一旦scheduler被实例化，scheduler可以被启动，设置为stand-by 模式，关闭。
 一旦scheduler被关闭，我们不能重启他，除非重新实例化它。
 触发器只有在scheduler被启动后才会被触发。在scheduler暂停时也不会触发触发器。
 
 
主要接口：
	Scheduler - the main API for interacting with the Scheduler.
				 调度器的主要接口
	Job - an interface to be implemented by components that you want the Scheduler to execute.
				我们需要调度器执行的任务
	Trigger - a component that defines the schedule upon which a given Job will be executed	
				触发器
	JobBuilder - used to define/build JobDetail instances, which define instances of Jobs.
				任务构造器
	TriggerBuilder - used to define/build Trigger instances
				触发器构造器
				
A Scheduler’s life-cycle is bounded by its creation, via a SchedulerFactory and a call to its shutdown() method.
调度器的生命周期被绑定在他的创造者SchedulerFactory，可以调用shutdown方法




