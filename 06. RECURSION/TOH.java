import java.io.*;
import java.util.*;

class TOH{

    public static void towerOfHanoi(int n,String src,String helper,String dest){
        if(n == 0) return;
        // Move topmost (n-1) disks from src to helper (using destination)
        towerOfHanoi(n-1,src,dest,helper);
        // Move 1 disk, from src to dest
        System.out.println("Move disk " + n + " from " + src + " to " + dest);
        // Move topmost (n-1) disks from helper to dest (using src)
        towerOfHanoi(n-1,helper,src,dest);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerOfHanoi(n,"A","B","C");
    }
}