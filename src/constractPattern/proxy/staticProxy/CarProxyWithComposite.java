package constractPattern.proxy.staticProxy;

/**
 * Created by liming on 2016/8/11.
 */
public class CarProxyWithComposite implements Moveable {

    private Moveable m ;

    public CarProxyWithComposite(Moveable m) {
        this.m = m;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        System.out.println("汽车开始行驶");
        m.move();
        long end = System.currentTimeMillis();
        System.out.println("汽车结束行驶，耗时：" + (end-start) + "ms");
    }
}
