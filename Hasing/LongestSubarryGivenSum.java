package Hasing;

import java.util.HashMap;

public class LongestSubarryGivenSum {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0,0,3};
        int sum = 3;
        System.out.println(longestSubarry(arr,sum));
        System.out.println(elongestSubarry(arr,sum));

    }
    static int longestSubarry(int[] arr,int sum){
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int pre_sum = 0;
            for (int j = i; j < arr.length; j++) {
                pre_sum += arr[j];
                if(pre_sum==sum){
                    res = Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }










    //efficient solution
    //using hashmap
    static int elongestSubarry(int[] arr,int sum){
        HashMap<Integer,Integer> h = new HashMap<>();
        int pre_sum =0 , res = 0;
        for (int i = 0; i < arr.length; i++) {
            pre_sum += arr[i];
            if(pre_sum==sum){
                res = i+1;
            }
            if(!h.containsKey(pre_sum)){
                h.put(pre_sum,i);
            }
            if(h.containsKey(pre_sum-sum)){
                res = Math.max(res,i-h.get(pre_sum-sum));
            }
        }
        return res;
    }
}
