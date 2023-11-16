import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        int arr[] = {7,8,3,1,2};
        for(int i=1;i<arr.length;i++){
            int element = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > element){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = element;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}