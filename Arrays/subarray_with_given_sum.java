package Arrays;

public class subarray_with_given_sum {
    public static void main(String[] args) {
        int[] arr = {4,8,12,5};
        System.out.println(givenSum(arr,4));

    }
    static boolean givenSum(int[] arr,int sum){
        int n = arr.length;
        int s = 0;
        int curr = 0;
        for (int e = 0; e < n; e++) {
            curr += arr[e];
            while (sum<curr){
                curr -= arr[s];
                s++;
            }if (curr==sum){
                return true;
            }
        }

        return false;
    }
}
