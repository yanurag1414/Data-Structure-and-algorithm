package Hasing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Longest_Consecutive_Subsequence {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,1,2,3};
        System.out.println(longestSubseq(arr));
        System.out.println(elongestSubseq(arr));

    }
    static int longestSubseq(int[] arr){
        int count=1,res=1;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==arr[i-1]+1){
                count++;
            } else if (arr[i]!=arr[i-1]) {
                res = Math.max(res,count);
                count = 1;

            }
        }
        return Math.max(res,count);
    }















    //efficient solution
    /*
    we transverse through array and check that arr[i]-1 is present or not
    if not present then this is the starting number of consecutive series,
    and we increase the count while arr[i]+1 is present
    when arr[i]-1 is not present then we initialize the count and start counting the
    second consecutive series
    */
    static int elongestSubseq(int[] arr){
        int res = 1;
        HashSet<Integer> h= new HashSet<>();
        for (int x:arr){
            h.add(x);

        }
        for (Integer x:h){
            if(!h.contains(x - 1)){
                int curr = 1;
                while (h.contains(x+curr)){
                    curr++;
                }
                res = Math.max(res,curr);
            }
        }
        return res;

    }
}
