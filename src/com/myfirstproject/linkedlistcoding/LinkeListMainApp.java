package com.myfirstproject.linkedlistcoding;

public class LinkeListMainApp {

    public static void main(String args){
        CustomLinkedList list = new CustomLinkedList();
        list.add(new CustomLinkedList.Node("Hello"));
        list.add(new CustomLinkedList.Node("Hi"));
        list.add(new CustomLinkedList.Node("GoodMorning"));
        list.add(new CustomLinkedList.Node("Go"));
        list.add(new CustomLinkedList.Node("Bye"));
        list.add(new CustomLinkedList.Node("Fir"));
        getTheMidNode(list);
    }
    static void getTheMidNode(CustomLinkedList list){
        int number=0;
        CustomLinkedList.Node firstNode = list.head();
        CustomLinkedList.Node secondNode = list.head();
        while(firstNode.next!=null){
            number++;
            if(number%2==0){
                secondNode=secondNode.next();
            }
            firstNode=firstNode.next();
        }
        System.out.println("The mid node id "+secondNode.data);
    }
}
