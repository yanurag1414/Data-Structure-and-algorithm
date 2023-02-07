package Sorting;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] nums={1,2,4,7,5};
        System.out.println(Arrays.toString(Isort(nums)));

    }
    static int[] Isort(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {                          //Time complexity
            for (int j = i+1; j >0 ; j--) {                                //Worst case:O(n^2)
                if(nums[j]<nums[j-1]){                                     //Best case:O(n)
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j-1]=temp;
                }else{
                    break;
                }
            }
        }
        return nums;
    }
}
