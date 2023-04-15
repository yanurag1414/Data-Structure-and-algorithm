package Searching;

public class index_Of_First_Ocurrence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,4,5};
        System.out.println(firstIndex(arr,4));

    }
    static int firstIndex(int[] nums,int target){
        int start=0;
        int end= nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;

            if(target>nums[mid]){
                start=mid+1;
            }else if(target<nums[mid]) {
                end=mid-1;
            }else {
                if (mid == 0 || nums[mid] != nums[mid - 1]) {
                    return mid;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
