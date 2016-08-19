package constractPattern.proxy.staticProxy;

/**
 * Created by liming on 2016/8/11.
 * 聚合比继承更好一些
 */
public class Test {

    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        System.out.println("========================");

        CarProxyWithExtends car2 = new CarProxyWithExtends();
        car2.move();

        System.out.println("========================");
        Moveable car3 = new CarProxyWithComposite(car);
        car3.move();
    }

}
