package wen.design.singleton.s10;

/**
 * Created by dell on 2017/2/23.
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println(ClassFactory.getInstance().hashCode());
    }

    public static void main(String[] args) {

        MyThread[] mts = new MyThread[10];
        for(int i = 0 ; i < mts.length ; i++){
            mts[i] = new MyThread();
        }

        for (int j = 0; j < mts.length; j++) {
            mts[j].start();
        }
    }
}