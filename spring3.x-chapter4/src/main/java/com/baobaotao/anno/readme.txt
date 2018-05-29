1、自动扫描，需要引入spring的context包，配置模板扫描特定类
< context:component-scan base-package="com.baobaotao" resource-pattern="anno/*.class"/ >

2、包含或者过滤特定类
<context:include-filter type="regex" expression="com\.baobaotao\.anno.*Dao"/>
<context:include-filter type="regex" expression="com\.baobaotao\.anno.*Service"/>
<context:exclude-filter type="aspectj" expression="com.baobaotao..*Controller+"/>