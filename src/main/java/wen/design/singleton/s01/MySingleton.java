package wen.design.singleton.s01;

/**
 * Created by dell on 2017/2/22.
 */
public class MySingleton {

    private static MySingleton instance = new MySingleton();

    private MySingleton(){}

    public static MySingleton getInstance() {
        return instance;
    }
}
