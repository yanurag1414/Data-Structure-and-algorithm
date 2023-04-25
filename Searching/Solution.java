package Searching;

class Solution {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(pindex(arr));
    }
    public static int search(int[] nums, int target) {
        int p = pindex(nums);
        int n = nums.length;
    
        int ans = bsearch(nums,0,p,target);
        if(ans != -1){
            return ans;
        }
         return bsearch(nums,p+1,n-1,target);
        
    }
    static int pindex(int[] arr){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int p = s+(e-s)/2;
        while(s<=e){
            if(arr[p]<arr[e]){
                e = p-1;
            }else{
                s = p+1;
            }
            if(p==n-1 || p==0){
                return p;
            }
        }
        return -1;
    }
    static int bsearch(int[] nums, int start,int end, int target){
        start=0;
        end= nums.length-1;
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