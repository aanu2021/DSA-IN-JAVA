import java.io.*;
import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}

class Stack{
    Node head;
    int size;
    Stack(){
        head = null;
        size = 0;
    }
    public void push(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }
    public void pop(){
        if(head == null){
            System.out.println("Stack is already empty");
            return;
        }
        head = head.next;
    }
    public int peek(){
        if(head == null) return -1;
        int value = head.data;
        return value;
    }
    public void printStack(){
        Node node = head;
        while(node != null){
            System.out.print(node.data + ", ");
            node = node.next;
        }
        System.out.println();
    }
}

class Stack_LL{
    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(2);
        stack.push(5);
        stack.push(3);
        stack.push(1);
        stack.push(7);
        System.out.println(stack.peek());
        stack.printStack();
        stack.pop();
        stack.pop();
        stack.printStack();
        System.out.println(stack.peek());
    }
}