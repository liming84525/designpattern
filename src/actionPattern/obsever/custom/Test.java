package actionPattern.obsever.custom;

/**
 * Created by liming on 2016/8/12.
 */
public class Test {


    public static void main(String[] args) {
        ConcreateSubject subject = new ConcreateSubject();
        for (int i=0; i<10; i++) {
            Observer obs = new ObserverImpl();
            subject.attach(obs);
        }
        subject.setState("update subject content");
    }

}
