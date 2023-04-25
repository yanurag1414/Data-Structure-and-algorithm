package Sorting;

import java.util.Arrays;

public class Chocolate_Distribution {
    public static void main(String[] args) {
        int[] arr = {7,3,1,8,9,12,57};
        System.out.println(distribute(arr,3));

    }
    static int distribute(int[] arr,int m){
        Arrays.sort(arr);
        int n = arr.length;
        if(m>n){
            return -1;
        }
        int res = arr[m-1]-arr[0];
        for (int i = 1; i+m-1 < n; i++) {
            res = Math.min(res,arr[i+m-1]-arr[i]);
        }
        return res;
    }
}
