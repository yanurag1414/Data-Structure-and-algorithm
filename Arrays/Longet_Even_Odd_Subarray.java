package Arrays;

public class Longet_Even_Odd_Subarray {
    public static void main(String[] args) {
        int[] arr = {5,10,20,6,3,8};
        System.out.println(lon_Subarr(arr));

    }
    static int lon_Subarr(int[] arr){
        int n = arr.length;
        int res = 1;
        int current = 1;

        for (int i = 1; i < n; i++) {

            if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0)){
                current++;
                res = Math.max(current,res);
            }else {
                current=1;
            }

        }return res;
    }
}
