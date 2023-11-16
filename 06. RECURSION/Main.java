import java.io.*;
import java.util.*;

class Main{

    public static int findPower(int x,int n){
        if(x == 0) return 0;
        if(n == 0) return 1;
        if(n == 1) return x;
        int calcPower = findPower(x,n/2);
        int currPower = calcPower*calcPower;
        if(n%2 != 0) currPower *= x;
        return currPower;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int p = findPower(x,n);
        System.out.println(p);
    }
}