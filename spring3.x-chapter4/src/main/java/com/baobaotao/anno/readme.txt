1、自动扫描，需要引入spring的context包，配置模板扫描特定类
< context:component-scan base-package="com.baobaotao" resource-pattern="anno/*.class"/ >

2、包含或者过滤特定类
<context:include-filter type="regex" expression="com\.baobaotao\.anno.*Dao"/>
<context:include-filter type="regex" expression="com\.baobaotao\.anno.*Service"/>
<context:exclude-filter type="aspectj" expression="com.baobaotao..*Controller+"/>

3、找不到指定的类不要抛出异常
@Autowired(required=false)

4、两个userDao，根据名称指定一个
@Autowired
@Qualifier("userDao")

5、设定类的单例多例模式
@Scope(BeanDefinition.SCOPE_PROTOTYPE)

6、init-method、destory-method
相当于@PostConstruct、@PreDestroy