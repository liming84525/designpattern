package constractPattern.adapter.composite;

import constractPattern.adapter.Origin;
import constractPattern.adapter.TargetImpl;

/**
 * Created by liming on 2016/8/12.
 * 实现源并且持有一个目标的实例，
 */
public class Adapter implements Origin {

    //使用组合的方式，这是个对象适配器
    private TargetImpl target;

    public Adapter(TargetImpl target) {
        this.target = target;
    }

    @Override
    public void origin() {
        target.target();
    }
}
