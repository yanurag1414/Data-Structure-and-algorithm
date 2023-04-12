package Arrays;

import java.util.Arrays;

public class Delete_duplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,4,4,5,5};
        int n = del_dup(arr);

        for (int i = 0; i < n; i++) {          //printing the starting numbers
            System.out.print(arr[i]+" ");
        }


    }
    static int del_dup(int[] arr){          //we are shifting repeated number to the right side
        int len = arr.length;               //we get the required numbers in the beginning
        int res = 1;
        for (int i = 1; i < len; i++) {
            if(arr[i] != arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }
}
