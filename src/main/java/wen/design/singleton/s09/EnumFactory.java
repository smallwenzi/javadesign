package wen.design.singleton.s09;

/**
 * Created by dell on 2017/2/22.
 */

public enum EnumFactory{

    singletonFactory;

    private MySingleton instance;

    private EnumFactory(){//ö����Ĺ��췽����������Ǳ�ʵ����
        instance = new MySingleton();
    }

    public MySingleton getInstance(){
        return instance;
    }

}

class MySingleton{//��Ҫ��ʵ�ֵ������࣬�������ݿ�����Connection
    public MySingleton(){}
}
