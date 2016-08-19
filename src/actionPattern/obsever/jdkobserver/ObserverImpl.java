package actionPattern.obsever.jdkobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by liming on 2016/8/12.
 */
public class ObserverImpl implements Observer {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    /**
     *
     * @param o  拉方式
     * @param arg 推方式
     */
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(o);
        System.out.println(arg);
    }
}
