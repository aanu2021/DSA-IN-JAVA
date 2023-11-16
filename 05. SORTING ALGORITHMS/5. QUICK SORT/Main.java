import java.io.*;
import java.util.*;

class Main{

    public static int partition(int arr[],int low,int high){
        int pivot = arr[low];
        int i = low + 1, j = high;
        do{
           while(arr[i] <= pivot){
              i++;
           }
           while(arr[j] > pivot){
              j--;
           }
           if(i < j){
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
           }
        }while(i < j);
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static void quicksort(int arr[],int low,int high){
        if(low < high){
            int pivot = partition(arr,low,high);
            quicksort(arr,low,pivot-1);
            quicksort(arr,pivot+1,high);
        }
    }

    public static void main(String[] args){
        int arr[] = {7,8,3,1,6,2};
        quicksort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}



