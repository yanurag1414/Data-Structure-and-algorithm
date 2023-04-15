package Arrays;

public class Slinding_Window_Technique {
    public static void main(String[] args){
        int[] arr = {1,8,30,-5,20,7};
        int k = 3;
        System.out.println(Max_Sum_Of_K_consecutive_element(arr,k));
    }
    static int Max_Sum_Of_K_consecutive_element(int[] arr,int k){
        int n= arr.length;
        int cur_sum = 0;
        for (int i = 0; i < k; i++) {
            cur_sum += arr[i];
        }
        int res = cur_sum;
        for (int i = k; i < n; i++) {
            cur_sum = arr[i]+cur_sum-arr[i-k];
            res = Math.max(cur_sum,res);

        }
        return res;
    }
}
