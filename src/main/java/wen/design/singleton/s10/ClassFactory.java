package wen.design.singleton.s10;

/**
 * Created by dell on 2017/2/23.
 */
public class ClassFactory{

    private enum MyEnumSingleton{
        singletonFactory;

        private MySingleton instance;

        private MyEnumSingleton(){//ö����Ĺ��췽����������Ǳ�ʵ����
            instance = new MySingleton();
        }

        public MySingleton getInstance(){
            return instance;
        }
    }

    public static MySingleton getInstance(){
        return MyEnumSingleton.singletonFactory.getInstance();
    }
}

class MySingleton{//��Ҫ��ʵ�ֵ������࣬�������ݿ�����Connection
    public MySingleton(){}
}