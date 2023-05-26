package Hasing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfelement {
    public static void main(String[] args) {
        int[] arr = {10,20,10,20,30,10,10};
        countFrequency(arr);

    }
    static void countFrequency(int[] arr){
        HashMap <Integer,Integer> h = new HashMap<>();
        for(int x:arr){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        for (Map.Entry<Integer,Integer> e:h.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
