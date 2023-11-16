import java.io.*;
import java.util.*;

class Permutations{

    public static void printAllPermutations(StringBuilder str,int idx){
        if(idx == str.length()){
            System.out.println(str.toString());
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for(int i=idx;i<str.length();i++){
            if(set.contains(str.charAt(i))) continue;
            set.add(str.charAt(idx));
            char temp = str.charAt(idx);
            str.setCharAt(idx,str.charAt(i));
            str.setCharAt(i,temp);
            printAllPermutations(str,idx+1);
            temp = str.charAt(idx);
            str.setCharAt(idx,str.charAt(i));
            str.setCharAt(i,temp);
        }
    }

    public static void main(String[] args){
        StringBuilder str = new StringBuilder("aba");
        printAllPermutations(str,0);
    }
}

