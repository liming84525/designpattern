package constractPattern.proxy.staticProxy;

import java.util.Random;

/**
 * Created by liming on 2016/8/11.
 */
public class Car implements Moveable {

    @Override
    public void move() {

        try{
            Thread.sleep(new Random().nextInt(1000));
            System.out.println("汽车行驶中");
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
