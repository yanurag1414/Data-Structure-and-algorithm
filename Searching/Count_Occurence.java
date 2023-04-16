package Searching;

public class Count_Occurence {
    public static void main(String[] args) {
        int[] arr = {10,20,20,20,40,40};
        System.out.println(countOccurence(arr,10));


    }
    //subtracting last and first occurrence and adding one to it
    static int countOccurence(int[] arr,int target){
        int first = firstIndex(arr,target);
        if(first == -1){
            return 0;
        }else {
            return lastIndex(arr,target)-first+1;
        }
    }
    //first occurrence
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




    //last ocurrence
    static int lastIndex(int[] arr,int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        while (s<=e){
            int mid = s+(e+s)%2;
            if(target>arr[mid]){
                s = mid+1;
            } else if (target<arr[mid]) {
                e = mid-1;
            }else {
                if (mid == n - 1 || arr[mid] != arr[mid+1] ) {
                    return mid;
                } else {
                    s = mid + 1;
                }
            }
        }
        return -1;
    }
}
