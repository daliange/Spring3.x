1、spring的工厂进行代理
org.springframework.aop.framework.ProxyFactory

2、方法执行前增强
org.springframework.aop.MethodBeforeAdvice

3、通过spring.xml配置代理

4、单例模式singleton最好使用Cglib代理，创建代理速度慢，运行效率高

6、跑出异常增强
org.springframework.aop.ThrowsAdvice