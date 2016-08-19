package constractPattern.adapter;

import constractPattern.adapter.Origin;

/**
 * Created by liming on 2016/8/12.
 */
public class Adaptee {

    private Origin origin;

    public Adaptee(Origin origin) {
        this.origin = origin;
    }

    public void use() {
        origin.origin();
    }


}
