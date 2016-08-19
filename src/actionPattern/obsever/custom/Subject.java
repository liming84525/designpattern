package actionPattern.obsever.custom;

/**
 * Created by liming on 2016/8/12.
 */
public interface Subject {

    void attach(Observer o);

    void detach(Observer o);

    void message();

}
