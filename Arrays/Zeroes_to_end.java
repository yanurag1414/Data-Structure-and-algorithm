package Arrays;

import java.util.Arrays;

public class Zeroes_to_end {
    public static void main(String[] args) {
        int[] arr = {1,2,0,4,0,0};
        System.out.println(Arrays.toString(zero_end(arr)));

    }
    static int[] zero_end(int[] arr){
        int len = arr.length;
        int count = 0;
        for (int i = 0; i < len; i++) {         //we just ignoring zeroes
            if(arr[i] != 0){                    //swapping non zero number to staring point
                int temp = arr[i];              //the index position of that number is the value of count
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        return arr;
    }
}
