package Searching;

public class Triplet_in_sorted_array {
    public static void main(String[] args) {
        int[] arr = {2,5,10,15,18};
        System.out.println(triplet(arr,33,0));

    }
    static boolean triplet(int[] arr,int sum,int si){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (isPair(arr, sum - arr[i], i + 1)) {
                return true;
            }
        }
        return false;

    }
    static boolean isPair(int[] arr,int sum,int si){
        int s = si;
        int e = arr.length-1;
        while (s<e){
            int temp = arr[s]+arr[e];
            if(temp==sum){
                return true;
            } else if (temp<sum) {
                s++;
            }else {
                e--;
            }
        }
        return false;
    }
}
