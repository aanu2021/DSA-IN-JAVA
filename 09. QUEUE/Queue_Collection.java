import java.io.*;
import java.util.*;
import java.util.Queue;

// Queue is an interface, LikedList is a class implementing the interface.

class Queue_Collection{
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
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