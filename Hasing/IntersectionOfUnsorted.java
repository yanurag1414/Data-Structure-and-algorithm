package Hasing;

import java.util.HashSet;

public class IntersectionOfUnsorted {
    public static void main(String[] args) {
        int[] a = {10,20,30,42,50,70};
        int[] b = {20,70,50,60,80,10,30};
        intesection(a,b);
        System.out.println();
        nIntersection(a,b);

    }
    //Efficient solution
   static void intesection(int[] a, int[] b) {
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < b.length; i++) {
            s.add(b[i]);
        }
        for (int i = 0; i < a.length; i++) {
            if (s.contains(a[i])) {
                System.out.print(a[i]+" ");
            }
        }

    }





    //Naive solution
   static void nIntersection(int[] a,int[] b){
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < b.length; j++) {
                if(a[i]==b[j]){
                    flag=true;
                    break;
                }
            }
            if(flag){
                System.out.print(a[i]+" ");
            }
        }
    }

}
