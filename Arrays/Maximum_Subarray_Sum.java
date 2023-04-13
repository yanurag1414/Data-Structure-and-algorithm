package Arrays;

public class Maximum_Subarray_Sum {
    public static void main(String[] args) {
        int[] arr = {-3,8,-2,4,-5,6};
        System.out.println(max_Sum(arr));

    }
    static int max_Sum(int[] arr){
        int n = arr.length;
        int result = arr[0];
        int maxending = arr[0];
        for (int i = 1; i < n; i++) {
            maxending = Math.max(arr[i]+maxending,arr[i] );
            result = Math.max(maxending,result);
        }return result;
    }
}
