package actionPattern.obsever.jdkobserver;

import java.util.Observable;

/**
 * Created by liming on 2016/8/12.
 */
public class Subject extends Observable{

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        super.setChanged(); //jdk中必须先调用setChanged;
        //推方法
//        super.notifyObservers(content);
        //啦方法 会将自身传递过去
        super.notifyObservers();
    }
}
