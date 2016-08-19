package actionPattern.templateMethod.lambda;

/**
 * Created by liming on 2016/8/11.
 * 使用接口代替抽象类
 */
public interface Basic1 {

    //模板方法
    default void work() {
        method1();
        childMethod();
        method2();
    }

    void childMethod();

    default void method2() {
        System.out.println("interface do 2");
    }

    default void method1() {
        System.out.println("interface do 1");
    }

}
