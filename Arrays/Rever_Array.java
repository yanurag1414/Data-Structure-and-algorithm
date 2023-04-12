package Arrays;

import java.util.Arrays;

public class Rever_Array {
    public static void main(String[] args) {
        int[] arr = {1,4,7,6,8,7,2};
        System.out.println(Arrays.toString(rev_arr(arr)));

    }
    static int[] rev_arr(int[] arr){
        int len = arr.length;
        int start = 0;
        int end = len-1;
        while (start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
}
