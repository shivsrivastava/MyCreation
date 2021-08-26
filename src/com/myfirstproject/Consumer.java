package com.myfirstproject;

import java.util.List;

public class Consumer implements Runnable{

    private List<Integer> sharedQueue;

    public Consumer(List<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        synchronized (sharedQueue){
            while(sharedQueue.size()==0){
                System.out.println("Queue is empty, consumer waiting");
                try {
                    sharedQueue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        synchronized (sharedQueue){
            while(sharedQueue.size()>0) {
                System.out.println("Consumed  " + sharedQueue.remove(0));
                try {
                    Thread.sleep((long) Math.random() * 2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("ConsumeR NOTIFY CALLED  ");
                sharedQueue.notify();
            }
            }
        }
    }
