package wen.design.singleton.s07;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by dell on 2017/2/22.
 */
public class MySingleton implements Serializable {

    private static final long serialVersionUID = 1L;

    //�ڲ���
    private static class MySingletonHandler{
        private static MySingleton instance = new MySingleton();
    }

    private MySingleton(){}
    public static MySingleton getInstance() {
        return MySingletonHandler.instance;
    }
    //�÷����ڷ����л�ʱ�ᱻ���ã��÷������ǽӿڶ���ķ������е��Լ���׳ɵĸо�
    protected Object readResolve() throws ObjectStreamException {
        System.out.println("������readResolve������");
        return MySingletonHandler.instance;
    }
}