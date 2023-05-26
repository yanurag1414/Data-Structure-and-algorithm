package Hasing;

import java.util.HashSet;
import java.util.Set;

public class PairWithSumUnsorted {
    public static void main(String[] args) {
        int[] arr = {8,3,4,2,5};
        System.out.println(sumPair(arr,6));

    }
    static boolean sumPair(int[] arr,int sum){
        Set <Integer> s = new HashSet<>();
        for (int x:arr) {
            if(s.contains(sum-x)){
                return true;
            }
            s.add(x);
        }
        return false;
    }
}
