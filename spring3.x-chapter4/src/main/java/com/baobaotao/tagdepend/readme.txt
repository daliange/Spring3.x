bean的继承
<bean id="car3" parent="abstractCar" />

bean的信赖
<bean id="cacheManager" class="com.baobaotao.tagdepend.CacheManager" depends-on="sysInit" />