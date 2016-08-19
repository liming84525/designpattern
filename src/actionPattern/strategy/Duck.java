package actionPattern.strategy;

/**
 * Created by liming on 2016/8/12.
 * 已经有的接口
 */
public abstract class Duck {

    private Fliable fly;

    public void setFly(Fliable fly) {
        this.fly = fly;
    }

    public void fly(){
        fly.fly();
    }

    public void quack() {
        System.out.println("gagaga!");
    }

    //形象不同
    public abstract void display();


}
