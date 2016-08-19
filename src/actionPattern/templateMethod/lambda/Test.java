package actionPattern.templateMethod.lambda;

/**
 * Created by liming on 2016/8/11.
 */
public class Test {

    public static void main(String[] args) {
        Basic1 basic = () -> System.out.println("匿名 do ");
        basic.work();

        basic = new BasicImpl();
        basic.work();
    }

}
