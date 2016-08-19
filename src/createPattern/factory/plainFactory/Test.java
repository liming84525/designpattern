package createPattern.factory.plainFactory;

/**
 * Created by liming on 2016/8/11.
 */
public class Test {

    public static void main(String[] args) {
        Factory factory = new Factory();
        IFactory instance = null;
        try{
            instance = factory.getByClassName("createPattern.factory.plainFactory.IFactoryImpl");
        }catch(Exception e) {
            e.printStackTrace();
        }
        String str = (String)instance.produce();
        System.out.println(str);
    }

}
