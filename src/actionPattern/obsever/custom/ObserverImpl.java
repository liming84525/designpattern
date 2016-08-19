package actionPattern.obsever.custom;

/**
 * Created by liming on 2016/8/12.
 */
public class ObserverImpl implements  Observer {

    private String observerState;

    @Override
    public void update(Subject sbj) {
        this.observerState = ((ConcreateSubject)sbj).getState();
        System.out.println("Observer receive: "+ observerState);
    }
}
