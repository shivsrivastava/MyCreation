package com.myfirstproject;

public class PrintSequentially implements Runnable{

    static int number=1;
    int remainder;
    int printUpto=10;
    static Object obj = new Object();
    PrintSequentially(int remainder){
        this.remainder=remainder;
    }

    @Override
    public void run() {
        while(number<printUpto){
            synchronized (obj){
                while((number%3)!=remainder){
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+" : "+number);
                number++;
                obj.notifyAll();
            }
        }
    }
}
