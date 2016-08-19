/**
 * Created by liming on 2016/8/12.
 * 代理一个对象，为他的类添加内容 或者更改
 * 1.静态代理
 * 1.1 代理中持有一个接口的实例，和传入一个实例的构造方法
 * 1.2 继承一个接口的实现类的实例，重写方法
 *
 * 2. 动态代理
 * 通过jdk/cglib的方式
 * 动态生成一个类，为原来的类添加方法
 * 主要熟悉使用的api
 *
 */
package constractPattern.proxy;