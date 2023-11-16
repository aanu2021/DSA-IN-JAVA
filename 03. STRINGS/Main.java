import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        if(firstName.compareTo(lastName) == 0){
            System.out.println("Same");
        }
        // firstName += " ";
        // firstName += lastName;
        // System.out.println(firstName);
        // System.out.println(firstName.length());
        // System.out.println(firstName.charAt(3));
        // System.out.println(firstName.substring(2));
        // firstName = firstName.substring(0,5) + "X" + firstName.substring(6);
        // System.out.println(firstName);
    }
}