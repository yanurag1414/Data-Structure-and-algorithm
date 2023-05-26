package Hasing;

import java.util.HashSet;

public class subArrayWithZeroSum {
    public static void main(String[] args) {
        int[] arr = {-3,1,1,1,1};
        System.out.println(isZeroSum(arr));
        System.out.println(eIsZero(arr));

    }




    //naive solution
    //we are transversing the whole array and checking for every
    //possible pair
    static boolean isZeroSum(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int pre_sum = 0;
            for (int j = i; j < arr.length; j++) {
                pre_sum += arr[j];
                if(pre_sum==0){
                    return true;
                }
            }
        }
        return false;
    }













    /*
    Efficient solution
    USing hashset
    if there is subset whose sum is zero then
    there must be a subset who coincide  with that subset
    means there will be two subset with equal value
    if that happens then we return true
     */
    static boolean eIsZero(int[] arr){
        HashSet<Integer> h = new HashSet<>();
        int pre_sum = 0;
        for(int i = 0; i < arr.length; i++) {
            pre_sum += arr[i];
            if(h.contains(pre_sum)){
                return true;
            }
            if(pre_sum==0){
                return true;
            }
            h.add(pre_sum);

        }
        return false;
    }
}
