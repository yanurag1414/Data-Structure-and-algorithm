package Arrays;

import java.util.Arrays;

public class delete_element {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8};
        del(arr,5,6);

    }
    static int del(int[] arr,int n,int x){
        for (int i = 0; i < n; i++) {
            if(arr[i]==x){
                break;
            }
            if(i==n){      //item not found in the array so size of array is not changed
                return n;
            }
            for (int j = i; j < n-1; j++) {
                arr[j] = arr[j+1];
            }
            System.out.println(Arrays.toString(arr));


        }return n-1;
    }
}
