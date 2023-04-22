package Sorting;

import java.util.Arrays;

public class Lomato_Partition {
    public static void main(String[] args) {
        int arr[] = {8,4,7,9,3,10,5};
        int n = arr.length;
        System.out.println(lomato(arr,0,n-1));
        System.out.println(Arrays.toString(qsort(arr,0,n-1)));

    }
    static int[] qsort(int[] arr,int l,int h){
        if(l<h){
            int i = lomato(arr,l,h);
            qsort(arr,0,i-1);
            qsort(arr,i+1,h);
        }
        return arr;
    }

    static int lomato(int[] arr,int l,int h) {

        int pivot = arr[h];
        int i = l - 1;
        for (int j = l; j <= h - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[h];
        arr[h] = temp;
        return i+1;
    }

//    static void swap(int a, int b) {
//        a = a ^ b;
//        b = a ^ b;
//        a = a ^ b;
//
//    }
}
