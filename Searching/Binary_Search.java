package Searching;

public class Binary_Search {

    //iterative method
    public static void main(String[] args) {
        int[] nums={2,3,4,7,6};
        System.out.println(bsearch(nums,4));
        int e = nums.length-1;
        System.out.println(rbsearc(nums,0,e,4));      //Time complexity
    }                                                          //O(logn)
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
    //recursive method
    static int rbsearc(int[] arr,int s,int e,int target ){

        if(s>e){
            return -1;
        }
        int mid = (s+e)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target>arr[mid]){
            return rbsearc(arr,mid+1,e,target);
        }else {
            return rbsearc(arr,s,mid,target);
        }
    }
}
