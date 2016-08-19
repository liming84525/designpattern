package constractPattern.proxy.staticProxy;

/**
 * Created by liming on 2016/8/11.
 */
public class Test2 {

    public static void main(String[] args) {
        Car car = new Car();
        CarTimeProxy ctp = new CarTimeProxy(car);
        CarLogProxy clp = new CarLogProxy(ctp);
        clp.move();
    }

}
