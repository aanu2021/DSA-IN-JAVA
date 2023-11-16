import java.io.*;
import java.util.*;

class LinkedLists{
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.addLast("a");
        list.addFirst("is");
        System.out.println(list);
        list.addFirst("this");
        list.addLast("list");
        System.out.println(list);
        System.out.println(list.size());
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        System.out.println(list.size());
        list.addFirst("this");
        list.addLast("list");
        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("NULL");
    }
}