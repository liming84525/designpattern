package constractPattern.adapter.extend;

import constractPattern.adapter.Adaptee;
import constractPattern.adapter.TargetImpl;
import constractPattern.adapter.composite.Adapter;

/**
 * Created by liming on 2016/8/12.
 */
public class Test {

    public static void main(String[] args) {
        Adapter2 adapter = new Adapter2();
        Adaptee adaptee = new Adaptee(adapter);
        adaptee.use();
    }

}
