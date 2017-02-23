package wen.design.singleton.s08;

/**
 * Created by dell on 2017/2/22.
 */
public class MySingleton{

    private static MySingleton instance = null;

    private MySingleton(){}

    static{
        instance = new MySingleton();
    }

    public static MySingleton getInstance() {
        return instance;
    }
}