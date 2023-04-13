package Arrays;

public class Maximum_Consecutive_ones {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,1,1,1,0};
        System.out.println(Max_Ones(arr));

    }
    static int Max_Ones(int[] arr){
        int n = arr.length;
        int current = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
                current = 0;
            }else {
                current++;
                result = Math.max(current,result);
            }
        }
        return result;
    }
}
