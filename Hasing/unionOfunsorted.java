package Hasing;

import java.util.HashSet;

public class unionOfunsorted {
    public static void main(String[] args) {
        int[] a = {15,20,5,15};
        int[] b = {15,15,15,20,10};
        System.out.println(unionOfunsorted(a,b));


    }
   static int unionOfunsorted(int[] a ,int[] b){
        HashSet <Integer> h = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            h.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            h.add(b[i]);
        }
        return h.size();
    }
}
