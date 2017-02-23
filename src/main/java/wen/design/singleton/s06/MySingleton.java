package wen.design.singleton.s06;

/**
 * Created by dell on 2017/2/22.
 */
public class MySingleton {

    //ÄÚ²¿Àà
    private static class MySingletonHandler{
        private static MySingleton instance = new MySingleton();
    }

    private MySingleton(){}

    public static MySingleton getInstance() {
        return MySingletonHandler.instance;
    }
}
