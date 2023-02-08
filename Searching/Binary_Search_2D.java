package Searching;

import java.util.Arrays;

public class Binary_Search_2D {
    public static void main(String[] args) {
        int[][] nums={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(bsearch2d(nums,5)));

    }
    static int[] bsearch2d(int[][] nums,int target){
        //we start from matrix[0][0]
        int r=0;
        //end at the last column of your row
        int c=nums.length-1;
        //we check that the given number is greater than or equal to the target
        //if number is greater than it means that all the number in that column are greater than the target
        //,so we ignore that column r--
        //if given number is smaller than the target than it means that all the numbers in that row are smaller
        //,so we ignore that row and move to another r++

        while (r< nums.length && c>=0){
            if(nums[r][c]==target){
                return new int[] {c,r};       //making new array to add column and row
            } else if (nums[r][c]>target) {
                c--;
            }else{
                r++;
            }
        }
        return new int[] {c,r};

    }
}
