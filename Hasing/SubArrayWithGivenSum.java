package Hasing;

import java.util.HashSet;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {5,8,6,13,3,-1};
        System.out.println(isSubSum(arr,22));
        System.out.println(eisSubSum(arr,22));

    }



    //Naive solution
    static boolean isSubSum(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            int pre_sum = 0;
            for (int j = i; j < arr.length; j++) {
                pre_sum += arr[j];
                if (pre_sum==target){
                    return true;
                }
            }
        }
        return false;
    }







    //Efficient solution
    /*
    we transverse from left to right and add prefix sum
    and check if prefix sum is equal to target or not
    and also check is hashset contains (prefix-target) or not
    if it contains then we return true

    we are checking this because if hashset contain (prefix-target) it means that
    there is a subset who's some is equal to the target
     */

    static boolean eisSubSum(int[] arr,int target){
        HashSet<Integer> h = new HashSet<>();
        int pre_Sum = 0;
        for (int x:arr) {
            pre_Sum += x;
            if(pre_Sum==target){
                return true;
            }
            if(h.contains(pre_Sum-target)){
                return true;
            }
            h.add(pre_Sum);
        }
        return false;
    }

}
