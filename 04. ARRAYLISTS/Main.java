import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);
        System.out.println(list);
        System.out.println(list.size());

        list.add(2,5);
        list.add(1,6);
        System.out.println(list);

        list.remove(list.size()-1);
        list.remove(2);
        System.out.println(list);

        list.set(1,7);
        list.set(2,2);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
        
    }
}