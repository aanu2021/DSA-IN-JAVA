import java.io.*;
import java.util.*;

class Main{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int isEven = 0;
        if(n%2 != 0) isEven = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            int left = n-i+1;
            int right = left + (2*i) - 1;
            for(int j=left;j<=right;j++){
                if((i+j)%2 == isEven){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}