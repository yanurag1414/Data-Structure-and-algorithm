package Arrays;

public class Maximum_circular_Sum_Subarray {
    public static void main(String[] args) {
        int[] arr = {8,-4,3,-5,4};
        System.out.println(max_sum(arr));

    }
    static int max_sum(int[] arr){
        int n = arr.length;
        int max_normal = kadanes(arr);
        if(max_normal<0){
            return max_normal;
        }
        int arr_sum = 0;
        for (int i = 0; i < n; i++) {
             arr_sum += arr[i];
             arr[i] = -arr[i];
        }
        int max_circular = arr_sum+kadanes(arr);
        return Math.max(max_circular,max_normal);

    }
    static int kadanes(int[] arr){
        int n = arr.length;
        int result = arr[0];
        int maxending = arr[0];
        for (int i = 1; i < n; i++) {
            result = Math.max(arr[i],arr[i]+maxending);
        }
        return result;
    }
}
