import java.io.*;
import java.util.*;

class Main{

    public static void merge(int arr[],int low,int mid,int high){
        int temp[] = new int[high-low+1];
        int i = low;
        int j = mid+1;
        int idx = 0;
        while(i <= mid || j <= high){
            if(i <= mid && j <= high){
                if(arr[i] <= arr[j]){
                    temp[idx++] = arr[i++];
                }
                else{
                    temp[idx++] = arr[j++];
                }
            }
            else if(i <= mid){
                temp[idx++] = arr[i++];
            }
            else{
                temp[idx++] = arr[j++];
            }
        }
        idx = 0;
        for(int index=low;index<=high;index++){
            arr[index] = temp[idx++];
        }
    }

    public static void mergesort(int arr[],int low,int high){
        if(low < high){
            int mid = (low + high)/2;
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }

    public static void main(String[] args){
        int arr[] = {7,8,3,1,6,2};
        mergesort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}