import java.io.*;
import java.util.*;

class Node{
    String data;
    Node next;
    Node(String data){
        this.data = data;
        this.next = null;
    }
}

class LL{
    Node head;
    int size;
    LL(){
        head = null;
        size = 0;
    }
    public void addFirst(String data){
       size++; 
       if(head == null){
          head = new Node(data);
          return;
       } 
       Node newNode = new Node(data);
       newNode.next = head;
       head = newNode;
    }
    public void addLast(String data){
       size++;
       if(head == null){
          head = new Node(data);
          return;
       } 
       Node newNode = new Node(data);
       Node node = head;
       while(node.next != null){
          node = node.next;
       }  
       node.next = newNode;
    }
    public void removeFirst(){
       if(head == null){
          System.out.println("List is already empty");
          return;
       }
       size--;
       head = head.next;
    }
    public void removeLast(){
       if(head == null){
          System.out.println("List is already empty");
          return;
       }
       size--;
       if(head.next == null){
          head = head.next;
          return;
       }
       Node current  = head.next;
       Node previuos = head;
       while(current.next != null){
          current = current.next;
          previuos = previuos.next;
       }
       previuos.next = null;
    }
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node node = head;
        while(node != null){
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("NULL");
    }
    public int getSize(){
        return size;
    }
}

class Introduction{
    public static void main(String[] args){
        LL list = new LL();
        list.addLast("a");
        list.addFirst("is");
        list.addLast("list");
        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize());
        list.removeFirst();
        list.removeLast();
        list.printList();
        System.out.println(list.getSize());
    }
}