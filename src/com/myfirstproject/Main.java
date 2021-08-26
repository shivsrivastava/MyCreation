package com.myfirstproject;
import com.myfirstproject.model.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello");
    Runnable r = ()->{System.out.println("hi");};
    Thread t = new Thread(r);
    MyThread m = new MyThread();
    t.start();
    }
}

