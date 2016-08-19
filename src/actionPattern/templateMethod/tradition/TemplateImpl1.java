package actionPattern.templateMethod.tradition;

/**
 * Created by liming on 2016/8/11.
 */
public class TemplateImpl1 extends AbstractTemplate {
    @Override
    protected void childMethod1() {
        System.out.println( "child do 1");
    }

    @Override
    protected void childMethod2() {
        System.out.println("child do 2");
    }

    @Override
    protected boolean yes() {
        return false;
    }
}
