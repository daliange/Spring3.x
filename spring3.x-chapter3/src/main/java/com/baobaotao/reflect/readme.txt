了解java的反射功能
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

学会srcAdd.jsp的使用？？？
加载的是哪类


/**获取类加载器**/
ClassLoader loader = Thread.currentThread().getContextClassLoader();
/**获取Class类**/
Class clazz = loader.loadClass("com.baobaotao.reflect.Car");

