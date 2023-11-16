import java.io.*;
import java.util.*;

class Queue{
    int arr[];
    int size;
    int front;
    int rear;
    Queue(int size){
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }
    public boolean isEmpty(){
        if(rear == -1) return true;
        else return false;
    }
    public boolean isFull(){
        if(rear == size-1) return true;
        else return false;
    }
    public void add(int data){
        if(isFull()){
            System.out.println("Queue is already full !!!");
            return;
        }
        if(rear == -1) front = 0;
        rear++;
        arr[rear] = data;
    }
    public void remove(){
        if(isEmpty()){
            System.out.println("Queue is already empty !!!");
            return;
        }
        for(int i=0;i<rear;i++){
            arr[i] = arr[i+1];
        }
        rear--;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return arr[0];
    }
}

class Queue_Array{
    public static void main(String[] args){
        Queue q = new Queue(5);
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