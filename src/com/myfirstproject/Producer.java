package com.myfirstproject;

import java.util.List;

public class Producer implements Runnable{
    private List<Integer> sharedQueue;
    private int maxItem=2;

    public Producer(List<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            synchronized (sharedQueue){
                while(sharedQueue.size()==maxItem){
                    System.out.println("Queue is full,producer waiting");
                    try {
                        sharedQueue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            synchronized (sharedQueue){
                    System.out.println("Queue is added with "+i);
                sharedQueue.add(i);
                try{
                Thread.sleep((long)Math.random() * 2000);
            }
                catch (InterruptedException e) {
                e.printStackTrace();
            }
                    sharedQueue.notify();
                }
            }

        }

    }
