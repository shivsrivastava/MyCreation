package com.myfirstproject;

import jdk.nashorn.internal.ir.FunctionCall;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PCProblem {
    private static List<Integer> sharedQueue = new ArrayList<Integer>();
    public static void main(String args[]){
    /*Producer p = new Producer(sharedQueue);
    Consumer c = new Consumer(sharedQueue);
Thread t1= new Thread(p,"producer thread");
        Thread t2= new Thread(c,"consumer thread");
        t1.start();t2.start();*/
        Predicate<Integer> predicate = x->x>2;
        Supplier<Integer> supplier = () -> new Random().nextInt(100);
        System.out.println(supplier.get());
        Consumer<Integer> consumer= x->System.out.println("Consumed "+x);
        Function<Integer,Integer> function= x->x*x;
        if(predicate.test(8)){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
        consumer.accept(9);
        System.out.println(function.apply(9));
    }
}
