package constractPattern.proxy.customDynamicProxy;

import constractPattern.proxy.staticProxy.CarTimeProxy;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by liming on 2016/8/11.
 *  目的： 模拟jdk 动态代理
 *  思路：
 *  通过Proxy.newProxyINstance 返回代理对象
 *  1. 生命一段源码（动态产生代理）
 *  2. 编译源码 （JDK Compiler API）, 产生新的类（代理类）
 *  3. 将这个类加载到内存中，产生一个新的对象（代理对象）
 *  4。 return 代理对象
 */
public class Proxy {

    public static Object newProxyInstance() throws Exception{
        File file = new File("C:\\Users\\liming\\Documents\\idea\\designPattern\\src\\constractPattern\\proxy\\staticProxy\\CarTimeProxy.java");
        FileInputStream fis = new FileInputStream(file);
        byte[] bytes = new byte[(int)file.length()];
        fis.read(bytes);
        String str = new String(bytes);
        System.out.println(str);
        return null;
    }


}
