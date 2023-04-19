package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Merge_sorted_array {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {4,5,6,7};
        mergeSortedArray(a,b);

    }
    static void mergeSortedArray(int[] a,int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        int[] ans = new int[n1 + n2];
        int i = 0;
        int j = 0;
        while (i < n1 && j < n2) {
            if (a[i] <= b[i]) {
                System.out.print(a[i]+" ");
                i++;
            } else {
                System.out.print(b[i]+" ");
                j++;
            }

        }
        while (i<n1){
            System.out.print(a[i]+" ");
            i++;
        }
        while (j<n2){
            System.out.print(b[j]+" ");
        j++;
        }

    }
}
