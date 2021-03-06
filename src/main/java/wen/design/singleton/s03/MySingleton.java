package wen.design.singleton.s03;

/**
 * Created by dell on 2017/2/22.
 */
public class MySingleton {

    private static MySingleton instance = null;

    private MySingleton(){}

    //public synchronized static MySingleton getInstance() {
    public static MySingleton getInstance() {
        try {
            synchronized (MySingleton.class) {
                if(instance != null){//懒汉式

                }else{
                    //创建实例之前可能会有一些准备性的耗时工作
                    Thread.sleep(300);
                    instance = new MySingleton();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return instance;
    }
}
