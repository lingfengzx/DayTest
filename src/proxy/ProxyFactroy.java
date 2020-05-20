package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * jdk代理模式
 * @author zxk
 *
 */
public class ProxyFactroy {
	private Object target;
	public ProxyFactroy(Object target) {
		this.target=target;
	}
	//目标对象一定要实现接口
	public Object getProxyInstance() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(),
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						//开始事物
						System.out.println("开始事物");
						// TODO Auto-generated method stub
						Object retvalue=method.invoke(target, args);
						//提交事物
						System.out.println("提交事物");
						return retvalue;
					}
				});
	}
}
