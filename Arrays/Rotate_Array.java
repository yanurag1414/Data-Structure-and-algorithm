package Arrays;

import java.util.Arrays;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        rotate_arr(arr,2);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }


    }
    static void rotate_arr(int[] arr,int d){
        int n = arr.length;
        reverse(arr,0,d);     //first reversing the d elements
        reverse(arr,d+1,n-1);          //then reversing the remaining elements
       reverse(arr,0,n-1);     //reversing whole array
    }
    static void reverse(int[] arr,int start,int end){
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
