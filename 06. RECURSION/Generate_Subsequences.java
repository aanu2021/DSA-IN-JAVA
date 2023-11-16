import java.io.*;
import java.util.*;

// String -> pass by value
// StringBuilder -> pass be reference
// We can't use stringbuilder as a key inside the hashset

class Generate_Subsequences{

    public static HashSet<String> set = new HashSet<>();
    public static HashSet<String> set2 = new HashSet<>();

    public static void generateAllSubsequences(String str,int idx,StringBuilder newStr){
        if(idx == str.length()){
            if(set2.contains(newStr.toString())){
                return;
            }
            else{
                set2.add(newStr.toString());
                System.out.println(newStr.toString());
                return;
            }
        }
        generateAllSubsequences(str,idx+1,newStr);
        newStr.append(str.charAt(idx) + "");
        generateAllSubsequences(str,idx+1,newStr);
        newStr.deleteCharAt(newStr.length() - 1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder("");
        generateAllSubsequences(str,0,sb);
    }
}