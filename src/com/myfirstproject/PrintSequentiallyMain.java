package com.myfirstproject;

public class PrintSequentiallyMain {
    public static void main(String args[]){
        PrintSequentially p1= new PrintSequentially(1);
        PrintSequentially p2 = new PrintSequentially(2);
        PrintSequentially p3 = new PrintSequentially(0);
        Thread t1 = new Thread(p1,"p1");
        Thread t2 = new Thread(p2,"p2");
        Thread t3 = new Thread(p3,"p3");
        t1.start();
        t2.start();
        t3.start();
    }
}
