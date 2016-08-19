package actionPattern.obsever.custom;

import java.util.ArrayList;

/**
 * Created by liming on 2016/8/12.
 */
public class SubjectImpl implements Subject{

    private java.util.List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o) {observers.add(o);}

    @Override
    public void detach(Observer o) {observers.remove(o);}

    @Override
    public void message() {observers.forEach( o -> o.update(this));}
}
