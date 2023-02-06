package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums={1,2,7,4,3,4};
        System.out.println(Arrays.toString(s_sort(nums)));

    }
    static int[] s_sort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int last= nums.length-i-1;
            //find maximum element in array and swap it with correct index
            int max=maxindex(nums,0, last);
            swap(nums,max,last);
        }
        return nums;
    }
    static int maxindex(int[] arr,int start,int end){                      //Time complexity
        int max=start;                                                     //Best case:O(n^2)
        for (int i = start; i <= end; i++) {                               //worst case:O(n^2)
            if(arr[max]<arr[i]){
                max=i;                                                    //Space complexity=O(1)

            }
        }
        return max;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}
