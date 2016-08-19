package actionPattern.templateMethod.lambda;

/**
 * Created by liming on 2016/8/11.
 */
public abstract class Hook {

    public Hook(Basic1 basic) {
        if(need()) {
            basic.work();
        }
    }

    protected abstract boolean need();

}
