package Searching;
//we simply apply binary search if the element found at mid-position return mid
//if the element is greater than mid than we store it in answer variable
//we update our answer variable with maximum value of the answer
//

public class Floor_Sorted_Array {
    public static void main(String[] args) {
        long[] arr = {1,2,8,10,11,12,19};
        long x = 5;
        System.out.println(findFloor(arr, arr.length, x));

    }
    static int findFloor(long[] arr, int n, long x)
    {
        int s = 0;
        int e = n-1;
        if(x>arr[e]){
            return e;
        }
        if(x<arr[s]){
            return -1;
        }
        long ans = 0;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==x){
                return mid;
            }else if(arr[mid]>x){
                ans = Math.max(ans,arr[mid]);
                e = mid-1;
            }else{

                s = mid+1;
            }

        }
        return (int)ans;
    }
}
