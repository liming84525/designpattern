package constractPattern.proxy.jdkproxy;

import constractPattern.proxy.staticProxy.Moveable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by liming on 2016/8/11.
 */
public class TimeHandler implements InvocationHandler {

    private Object target;


    public TimeHandler(Object target) {
        this.target = target;
    }

    /**
     *
     * @param proxy  被代理的对象
     * @param method 被带离对象的方法
     * @param args   方法的参数
     * @return Object 方法的返回值
     * @throws Throwable 抛出的错误
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("汽车开始行驶");
        method.invoke(target);
        long end = System.currentTimeMillis();
        System.out.println("汽车结束行驶，耗时：" + (end-start) + "ms");

        return  null;
    }
}
