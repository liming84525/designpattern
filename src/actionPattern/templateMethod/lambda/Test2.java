package actionPattern.templateMethod.lambda;

/**
 * Created by liming on 2016/8/11.
 */
public class Test2 {

    public static void main(String[] args) {
        Hook hook = new Hook( () -> System.out.println("hook do")) {
            @Override
            protected boolean need() {
                return false;
            }
        };
    }

}
