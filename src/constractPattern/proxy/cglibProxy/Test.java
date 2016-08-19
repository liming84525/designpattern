package constractPattern.proxy.cglibProxy;

/**
 * Created by liming on 2016/8/11.
 */
public class Test {

    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        Train t = (Train) proxy.getProxy(Train.class);
        t.move();
        t.test();
    }


}
