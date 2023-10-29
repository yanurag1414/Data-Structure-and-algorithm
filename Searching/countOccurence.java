package Searching;

import java.util.HashMap;
import java.util.Map;

public class countOccurence {
    public static void main(String[] args) {
        int[] arr = {3,1,2,2,1,2,3,3};
        int k = 4;
        System.out.println(countOccurence(arr, arr.length, k));
    }
    public static int countOccurence(int[] arr, int n, int k)
    {
        HashMap<Integer,Integer> res = new HashMap<>();
        for (int j : arr) {
            res.put(j, res.getOrDefault(j, 0) + 1);  //sets the default value of key
        }
        int count = 0;
        for(Map.Entry<Integer,Integer>e:res.entrySet()){
            if(e.getValue()>=n/k){
                count++;
            }
        }
        return count;
    }
}
