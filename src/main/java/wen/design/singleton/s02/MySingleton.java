package wen.design.singleton.s02;

/**
 * Created by dell on 2017/2/22.
 */
public class MySingleton {

    private static MySingleton instance = null;

    private MySingleton(){}

    public static MySingleton getInstance() {
        if(instance == null){//懒汉式
            //创建实例之前可能会有一些准备性的耗时工作
            try {
                Thread.sleep(300);
            }catch (Exception e){
                e.printStackTrace();
            }
            instance = new MySingleton();
        }
        return instance;
    }
}
