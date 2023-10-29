package Sorting;
//we perform binary search.
//when the array element at mid is equal to the target element then
//we check two conditions if the mid == 0 or arr[mid]!=arr[mid-1]
//if these conditions are truer than we return mid
//else we move mid left by changing end index to mid-1

public class LeftIndex {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,5,5,6,7};
        System.out.println(leftIndex(arr.length, arr,1));

    }
    static int leftIndex(int n, int arr[], int x)
    {

        // Your code here
        int s = 0;
        int e = n-1;
        int t = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
           if(arr[mid]>x){
                e = mid-1;
            }else if(arr[mid]<x){
                s = mid+1;
            }else{
               if(mid==0 || arr[mid]!=arr[mid-1]){
                   return mid;
               }else{
                   e = mid-1;
               }
           }
        }
        return -1;
    }
}
