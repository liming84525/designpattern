package actionPattern.obsever.custom;

/**
 * Created by liming on 2016/8/12.
 */
public class ConcreateSubject extends SubjectImpl{

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        super.message();
    }
}
