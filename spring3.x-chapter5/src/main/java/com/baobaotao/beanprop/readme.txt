1、配置文件在spring的加载路径
<context:property-placeholder
		 location="classpath:com/baobaotao/placeholder/jdbc.properties"/>
		 
		 
2、引用别的类的值
<bean class="com.baobaotao.beanprop.ApplicationManager"
	    p:maxTabPageNum="#{sysConfig.maxTabPageNum}"
	    p:sessionTimeout="#{sysConfig.sessionTimeout}"/>  

@Value("#{sysConfig.sessionTimeout}")
private int sessionTimeout;
