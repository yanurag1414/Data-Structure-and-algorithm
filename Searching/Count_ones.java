package Searching;

public class Count_ones {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1,1,1};
        System.out.println(countOnes(arr));

    }
    static int countOnes(int[] arr){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        while (s<=e){
            int mid = s+(s+e)%2;
            if(arr[mid]==0){
                s = mid+1;
            }else {
                if(mid == 0 || arr[mid] != arr[mid-1]){
                    return n-mid;
                }else {
                    e = mid-1;
                }

            }
        }
        return 0;
    }
}
