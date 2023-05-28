package Hasing;

import java.util.HashMap;
import java.util.HashSet;

public class SubArrayWithCommonSum {
    public static void main(String[] args) {
        int[] a = {0,1,0,0,0,0,0};
        int[] b = {1,0,1,0,0,0,1};
        System.out.println(commonSum(a,b));
        System.out.println(ecommonSum(a,b));

    }
    //naive solution
    static int commonSum(int[] a,int[] b ){
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            int sum1 = 0, sum2 = 0;
            for (int j = i; j < a.length; j++) {
                sum1 += a[j];
                sum2 += b[j];
                if(sum1==sum2){
                    res = Math.max(res,j-i+1);
                }
            }

        }
        return res;
    }










    /*
    efficient solution
    we find the difference of two arrays and store it in a temp array
    then we compute the longest sub array with sum zero in our temp array
     */

    static int ecommonSum(int[] a, int[] b){
        int[] arr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i]-b[i];
        }
        HashMap<Integer,Integer> h = new HashMap<>();

        int pre_sum = 0, res = 0;
        for (int i = 0; i < arr.length; i++) {
            pre_sum += arr[i];
            if(pre_sum==0){
                res = i+1;
            }
            if(h.containsKey(pre_sum)){
                res = Math.max(res,i-h.get(pre_sum));
            }else{
                h.put(pre_sum,i);
            }
        }
        return res;

    }
}
