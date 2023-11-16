import java.io.*;
import java.util.*;

class Remove_Duplicates{

    public static boolean map[] = new boolean[26];

    public static void removeDuplicates(String str,int idx,String newStr){
        if(idx == str.length()){
           System.out.println(newStr);
           return;
        } 
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            removeDuplicates(str,idx+1,newStr);
        }
        else{
            map[currChar-'a'] = true;
            newStr += currChar;
            removeDuplicates(str,idx+1,newStr);
        }
    }

    public static void main(String[] args){
        String str = "abccbda";
        String newStr = "";
        removeDuplicates(str,0,newStr);
    }
}