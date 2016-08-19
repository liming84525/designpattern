package createPattern.factory.plainFactory;

/**
 * Created by liming on 2016/8/11.
 * 工厂主要就是创建已知类的实例
 * 匿名类生成的直接就是接口的实例，所以不用工厂类生成了
 */
public class Factory {

    /**
     * 反射获得
     * @param clazz 类名 实现Ifactory的子类可以创建实例
     * @return 工厂的子类实例
     */
    public IFactory getByClassName(String clazz) throws Exception{
        IFactory instance = (IFactory)Class.forName(clazz).newInstance();
        return instance;
    }


}
