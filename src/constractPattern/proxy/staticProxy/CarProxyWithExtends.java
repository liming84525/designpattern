package constractPattern.proxy.staticProxy;

/**
 * Created by liming on 2016/8/11.
 * 使用继承的方式实现代理
 */
public class CarProxyWithExtends extends Car {


    @Override
    public void move() {
        long start = System.currentTimeMillis();
        System.out.println("汽车开始行驶");
        super.move();
        long end = System.currentTimeMillis();
        System.out.println("汽车结束行驶，耗时：" + (end-start) + "ms");
    }
}
