package com.myfirstproject.linkedlistcoding;

public class CustomLinkedList {
    private Node head;
    private Node tail;

    CustomLinkedList(){
        head = new Node("head");
        tail = head;
    }

    public Node head(){
        return head;
    }

    public void add(Node next){
        tail.next=next;
        tail=tail.next();
    }

    public static class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
        }
        public Node next(){
            return next;
        }
        public String data(){
            return data;
        }
        public void setData(String data){
            this.data=data;
        }
        public void setNext(Node next){
            this.next=next;
        }
        @Override
        public String toString() {
            return "Node{" +
                    "data='" + data + '\'' +
                    ", next=" + next +
                    '}';
        }
    }
}
