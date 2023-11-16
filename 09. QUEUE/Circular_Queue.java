import java.io.*;
import java.util.*;

class Queue{
    int arr[];
    int size;
    int front;
    int rear;
    Queue(int size){
        arr = new int[size];
        this.size = size;
        front = -1;
        rear = -1;
    }
    public boolean isEmpty(){
        if(front == -1 && rear == -1) return true;
        else return false;
    }
    public boolean isFull(){
        if((rear + 1)%size == front) return true;
        else return false;
    }
    public void add(int data){
        if(isFull()){
            System.out.println("Queue is already full");
            return;
        }
        if(rear == -1) front = 0;
        rear = (rear + 1)%size;
        arr[rear] = data;
    }
    public void remove(){
        if(isEmpty()){
            System.out.println("Queue is already empty");
            return;
        }
        if(front == rear){
            front = -1;
            rear = -1;
        }
        else{
            front = (front + 1)%size;
        }
    }
    public int peek(){
        if(isEmpty()) return -1;
        return arr[front];
    }
}

class Circular_Queue{
    public static void main(String[] args){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();
        q.add(6);
        q.remove();
        q.add(7);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}