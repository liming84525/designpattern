package constractPattern.adapter;

import constractPattern.adapter.Origin;

/**
 * Created by liming on 2016/8/12.
 * 代表一个源实现类
 */
public class OriginImpl implements Origin {
    @Override
    public void origin() {
        System.out.println("this user origin");
    }
}
