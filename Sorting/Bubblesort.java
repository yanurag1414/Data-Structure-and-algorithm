package Sorting;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] nums={2,1,4,6,7,3,5};
        System.out.println(Arrays.toString(bsort(nums)));

    }
    static int[] bsort(int[] nums){                               // Space complexity=O(1)
        for (int i = 0; i < nums.length; i++) {                   //Time complexity
            for (int j = 1; j < nums.length-i; j++) {              //best case:O(N)
                if(nums[j-1]>nums[j]){                               //worst case:O(N^2)
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }else{
                    continue;
                }
            }
        }
        return nums;
    }
}
