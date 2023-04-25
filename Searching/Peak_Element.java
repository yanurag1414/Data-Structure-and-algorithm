package Searching;

public class Peak_Element {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(peakElement(arr));

    }
    static int peakElement(int[] arr){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        while (s<=e) {
            int mid = s + (e - s) / 2;
            if ((mid == 0 || arr[mid] >= arr[mid - 1]) && (mid == n - 1 || arr[mid] >= arr[mid + 1])) {
                return mid;
            }
            if (mid > 0 && arr[mid] <= arr[mid-1]) {
                e = mid - 1;
            }else {
                s = mid+1;
            }
        }
        return -1;
    }
}
