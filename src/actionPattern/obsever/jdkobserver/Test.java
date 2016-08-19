package actionPattern.obsever.jdkobserver;

/**
 * Created by liming on 2016/8/12.
 */
public class Test {

    public static void main(String[] args) {
        Subject sub = new Subject();
        sub.addObserver(new ObserverImpl());
        sub.addObserver(new ObserverImpl());
        sub.setContent("我是推方法");
    }

}
