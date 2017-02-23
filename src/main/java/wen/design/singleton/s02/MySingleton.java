package wen.design.singleton.s02;

/**
 * Created by dell on 2017/2/22.
 */
public class MySingleton {

    private static MySingleton instance = null;

    private MySingleton(){}

    public static MySingleton getInstance() {
        if(instance == null){//����ʽ
            //����ʵ��֮ǰ���ܻ���һЩ׼���Եĺ�ʱ����
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
