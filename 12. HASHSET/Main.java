import java.io.*;
import java.util.*;

// add - O(1)
// remove - O(1)
// contains - O(1)

class Main{
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(2);
        if(set.contains(1)){
            System.out.println("1 is present inside the set");
        }
        if(!set.contains(4)){
            System.out.println("4 is not present inside the set");
        }
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("1 is not present inside the set");
        }
        set.add(1);
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}