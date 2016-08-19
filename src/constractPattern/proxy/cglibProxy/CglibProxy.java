package constractPattern.proxy.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by liming on 2016/8/11.
 */
public class CglibProxy implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz) {
        //设置创建子类的类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }


    /**
     * 拦截所有目标类方法的调用
     * @param obj 目标类的实例
     * @param method 目标类的方法
     * @param args   方法的参数
     * @param proxy  代理类的实例
     * @return  方法的返回值
     * @throws Throwable  抛出的异常
     */
    @Override
    public Object intercept(Object obj,
                            Method method, Object[] args,
                            MethodProxy proxy)
            throws Throwable {
        if(method.getName().equals("move")) {
            System.out.println("before entity invoke");
            proxy.invokeSuper(obj, args);
            System.out.println("after entity invoke");
        } else {
            System.out.println("do nothing");
        }


        return null;
    }
}
