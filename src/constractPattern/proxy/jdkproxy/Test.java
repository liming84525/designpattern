package constractPattern.proxy.jdkproxy;

import constractPattern.proxy.staticProxy.Car;
import constractPattern.proxy.staticProxy.Moveable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by liming on 2016/8/11.
 * JDK  动态代理
 */
public class Test {

    public static void main(String[] args) {
        //代理的类型必须是接口类型，而不是他的实现类。实际类型是他的实现类
        Moveable car = new Car();
        InvocationHandler handler = new TimeHandler(car);
        Class<?> cls = car.getClass();
        //返回一个当前对象的代理对象
        Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(),
                cls.getInterfaces(), handler);
        m.move();

    }


}
