import java.io.*;
import java.util.*;

class Stack{
    ArrayList<Integer> list;
    int size;
    Stack(){
        list = new ArrayList<>();
        size = 0;
    }
    public boolean isEmpty(){
       return list.size() == 0;
    }
    public void push(int data){
       size++;
       list.add(data); 
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is already empty");
            return;
        }
        size--;
        list.remove(list.size()-1);
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        int value = list.get(list.size()-1);
        return value;
    }
    public int size(){
        return size;
    }
    public void printStack(){
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();
    }
}

class Stack_ArrayList{
    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.size());
        stack.printStack();
        stack.pop();
        stack.pop();
        System.out.println(stack.size());
        stack.printStack();
    }
}