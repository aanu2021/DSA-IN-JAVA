import java.io.*;
import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
       this.data = data;
       this.next = null;
    }
}

class Queue{
    Node head;
    Node tail;
    int size;
    Queue(){
        head = null;
        tail = null;
        size = 0;
    }
    public boolean isEmpty(){
        if(head == null) return true;
        else return false;
    }
    public void add(int data){
        size++;
        if(isEmpty()){
            head = new Node(data);
            tail = head;
            return;
        } 
        Node newNode = new Node(data);
        tail.next = newNode;
        tail = newNode;
    }
    public void remove(){
        if(isEmpty()){
            System.out.println("Queue is already empty");
            return;
        }
        size--;
        head = head.next;
        if(head == null) tail = null;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        int value = head.data;
        return value;
    }
    public int size(){
       return size;
    }
}

class Queue_LinkedList{
    public static void main(String[] args){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}