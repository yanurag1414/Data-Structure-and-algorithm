package Searching;

public class Binary_Search {
    public static void main(String[] args) {
        int[] nums={2,3,4,7,6};
        System.out.println(bsearch(nums,4));          //Time complexity
    }                                                        //O(logn)
    static int bsearch(int[] nums, int target){
        int start=0;
        int end= nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }else {
                end=mid-1;
            }
            if(target==nums[mid]){
                return mid;
            }
        }
        return -1;
    }
}
