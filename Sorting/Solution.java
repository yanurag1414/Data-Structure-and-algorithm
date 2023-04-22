package Sorting;

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int arr[] = {8,4,7,9,3,10,5};
        
        int n = arr.length;
        System.out.println(iPartition(arr,0,n-1));


        System.out.println(Arrays.toString(qSort(arr,0,n-1)));
        
    }
    
    static int iPartition(int arr[], int l, int h)
    {   
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return i+1;
    }
    
    static int[] qSort(int arr[],int l,int h){
        if(l<h){
            int p=iPartition(arr,l,h);
            qSort(arr,l,p-1);
            qSort(arr,p+1,h);
        }
        return arr;
    }
}
