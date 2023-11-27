package Hasing;

import java.util.Arrays;
import java.util.HashSet;

public class CountDistincElement {
    public static void main(String[] args) {
        Integer[] arr = {15,12,13,12,13,13,18};
//        System.out.println(countDistinct(arr));
//        System.out.println(ncountDistinct(arr));
        System.out.println(ecountDistinct(arr));

    }
   static int countDistinct(int[] arr){
        //hashset does not allow duplicate elements
       //element stored only one times
        HashSet <Integer> hs = new HashSet<>();
        int n = arr.length;
        for (int i = 0 ; i<n ; i++){
            hs.add(arr[i]);
        }
        return hs.size();
    }







    //naive solution
    //we're just skipping the call when there is an duplicate element found
     static int ncountDistinct(int[] arr){
        int n = arr.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            //checking the element on the left side of the element at ith position
            for (int j = 0; j < i; j++) {
                if(arr[i]==arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag==false){
                res++;
            }
        }
        return res;
    }









    //more short code
    static int ecountDistinct(Integer[] arr){
        HashSet <Integer> hs = new HashSet<>(Arrays.asList(arr));
        return hs.size();
    }

}
