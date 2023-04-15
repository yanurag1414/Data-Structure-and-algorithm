package Arrays;

public class Minimum_Consecutive_flips {
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1,1,0,0,0};
        min_Flips(arr);

    }
    static  void min_Flips(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if(arr[i] != arr[i-1]){
                if(arr[i] != arr[0]){
                    System.out.print("from "+i+" to ");
                }else {
                    System.out.println(i-1);
                }
            }
        }
        if(arr[n-1] != arr[0]){
            System.out.println(n-1);
        }

    }
}
