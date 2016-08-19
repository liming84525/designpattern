package actionPattern.strategy;

/**
 * Created by liming on 2016/8/12.
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        super();
        super.setFly(new Fliable() {
            @Override
            public void fly() {
                System.out.println("");
            }
        });
    }

    @Override
    public void display() {
        System.out.println("红头鸭子");
    }
}
