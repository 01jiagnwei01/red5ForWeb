# red5ForWeb
1 org.red5.server.Bootstrap类里初始化参数

red5.deployment.type 					可选类型：  bootstrap or war
sun.lang.ClassLoader.allowArraySyntax	设置值:	true
logback.ContextSelector					可配置，默认值为org.red5.logging.LoggingContextSelector
java.security.policy					可配置，默认值为%red5.config_root%/red5.policy
java.io.tmpdir							Users\\Default\\AppData\\Red5 或者是\\AppData\\localLow

2加载org.red5.server.Launcher类的launch方法

useLogback								默认值是：true
加载spring配置文件classpath:/red5.xml ,变量名称为：root
root.refresh();
