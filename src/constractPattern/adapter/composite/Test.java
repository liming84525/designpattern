package constractPattern.adapter.composite;

import constractPattern.adapter.Adaptee;
import constractPattern.adapter.TargetImpl;

/**
 * Created by liming on 2016/8/12.
 */
public class Test {

    public static void main(String[] args) {
        TargetImpl target = new TargetImpl();
        Adapter adapter = new Adapter(target);
        Adaptee adaptee = new Adaptee(adapter);
        adaptee.use();
    }

}
