package Sorting;


//we not get the correct position of pivot
//but at particular index elements at left and right are
// smaller and greater elements from the pivot
//this method is not stable thats why quick sort is not stable

import java.util.Arrays;

public class Hoares_Partion {
    public static void main(String[] args) {
        int[] arr = {0,1,2};
        int n = arr.length;
        System.out.println(hoares(arr,0,n-1));

//        System.out.println(Arrays.toString(qsort(arr,0,n-1)));

    }
    static void qsort(int[] arr,int l ,int h){
        if(l<h){
            int i = hoares(arr,l,h);
            qsort(arr,0,i);
            qsort(arr,i+1,h);
        }

    }
    static int hoares(int[] arr,int l,int h){

        int j = h+1;
        int i = l-1;
        int pivot = arr[l];
        while (true){
            do {
                i++;
            }while (arr[i]<pivot);
            do {
                j--;
            }while (arr[j]>pivot);
            if(i>=j){
                return j;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }


    }
}
