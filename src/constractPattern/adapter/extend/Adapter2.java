package constractPattern.adapter.extend;

import constractPattern.adapter.Origin;
import constractPattern.adapter.TargetImpl;

/**
 * Created by liming on 2016/8/12.
 * 继承一个目标接口的实现类，达到适配的目的
 * 然而，由于单继承，他不能适配接口的其他实现类，所以只能适配这一个类
 *
 * 所以他称作类适配器
 */
public class Adapter2 extends TargetImpl implements Origin{

    @Override
    public void origin() {
        System.out.println("this is a extended adapter");
        this.target();
    }

}
