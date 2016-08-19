package actionPattern.templateMethod.tradition;

/**
 * Created by liming on 2016/8/11.
 * 为子类提供一个模板，实现一些方法，其他由子类实现
 */
public abstract class AbstractTemplate {

    //模板方法 主流程
    public final void work() {

        method1();
        childMethod1();
        if(yes()) {
            childMethod2();
        }
        method2();

    }

    //钩子方法1，子类实现后，可对 work 进行流程控制
    protected boolean yes() {
        return true;
    }

    private void method1(){
        System.out.println("step1");
    }

    private void method2(){
        System.out.println("step2");
    }

    //子类实现方法1
    protected abstract void childMethod1();

    //子类实现方法2
    protected abstract void childMethod2();


}
