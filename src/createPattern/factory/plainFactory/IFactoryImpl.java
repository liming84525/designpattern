package createPattern.factory.plainFactory;

/**
 * Created by liming on 2016/8/11.
 */
public class IFactoryImpl implements IFactory {
    @Override
    public Object produce() {
        System.out.println("create String");
        return "Hello World";
    }
}
