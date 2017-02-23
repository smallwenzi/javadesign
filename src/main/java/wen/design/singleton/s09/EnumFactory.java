package wen.design.singleton.s09;

/**
 * Created by dell on 2017/2/22.
 */

public enum EnumFactory{

    singletonFactory;

    private MySingleton instance;

    private EnumFactory(){//枚举类的构造方法在类加载是被实例化
        instance = new MySingleton();
    }

    public MySingleton getInstance(){
        return instance;
    }

}

class MySingleton{//需要获实现单例的类，比如数据库连接Connection
    public MySingleton(){}
}
