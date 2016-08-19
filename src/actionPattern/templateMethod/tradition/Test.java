package actionPattern.templateMethod.tradition;

/**
 * Created by liming on 2016/8/11.
 */
public class Test {

    public static void main(String[] args) {
        AbstractTemplate at = new AbstractTemplate() {
            @Override
            protected void childMethod1() {
                System.out.println("匿名 do 1");
            }

            @Override
            protected void childMethod2() {
                System.out.println("匿名 do 2");
            }

        };

        AbstractTemplate at2 = new TemplateImpl1();

        at.work();
        System.out.println("++++++++++++++++++++++++");
        at2.work();
    }

}
