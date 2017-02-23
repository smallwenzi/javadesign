package wen.design.singleton.s04;

/**
 * Created by dell on 2017/2/22.
 */
public class MySingleton {

    private static MySingleton instance = null;

    private MySingleton(){}

    public static MySingleton getInstance() {
        try {
            if(instance != null){//����ʽ

            }else{
                //����ʵ��֮ǰ���ܻ���һЩ׼���Եĺ�ʱ����
                Thread.sleep(300);
                synchronized (MySingleton.class) {
                    instance = new MySingleton();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return instance;
    }
}
