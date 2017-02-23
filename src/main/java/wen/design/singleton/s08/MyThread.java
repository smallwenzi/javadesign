package wen.design.singleton.s08;

/**
 * Created by dell on 2017/2/23.
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(MySingleton.getInstance().hashCode());
        }
    }

    public static void main(String[] args) {

        MyThread[] mts = new MyThread[3];
        for(int i = 0 ; i < mts.length ; i++){
            mts[i] = new MyThread();
        }

        for (int j = 0; j < mts.length; j++) {
            mts[j].start();
        }
    }
}