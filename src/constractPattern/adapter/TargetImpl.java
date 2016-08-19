package constractPattern.adapter;

import com.sun.xml.internal.ws.api.ComponentFeature;
import constractPattern.adapter.Target;

/**
 * Created by liming on 2016/8/12.
 * 代表一个目标实现类
 */
public class TargetImpl implements Target {

    @Override
    public void target() {
        System.out.println("this use target");
    }
}
