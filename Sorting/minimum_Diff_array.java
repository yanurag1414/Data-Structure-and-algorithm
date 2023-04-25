package Sorting;

import com.sun.jdi.IntegerValue;

import java.util.Arrays;

public class minimum_Diff_array {
    public static void main(String[] args) {
        int[] arr = {10,8,1,4};
        System.out.println(minDiff(arr));

    }
    static int minDiff(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            res = Math.min(res,Math.abs(arr[i-1]-arr[i]));
        }
        return res;
    }
}
