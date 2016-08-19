package actionPattern.templateMethod.lambda;

/**
 * Created by liming on 2016/8/11.
 */
public class BasicImpl implements  Basic1 {

    @Override
    public void childMethod() {
        System.out.println("child do ");
    }
}
