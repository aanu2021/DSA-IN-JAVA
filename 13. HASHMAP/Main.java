import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India",120);
        map.put("Australia",10);
        map.put("China",170);
        map.put("India",130);
        map.put("Brazil",15);
        map.put("Australia",30);
        System.out.println(map);
        map.remove("Brazil");
        System.out.println(map);
        if(map.containsKey("Australia")){
            System.out.println("Australia -> " + map.get("Australia"));
        }
        if(!map.containsKey("Brazil")){
            System.out.println("Brazil is not found");
        }
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}