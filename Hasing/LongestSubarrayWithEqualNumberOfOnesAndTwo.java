package Hasing;

public class LongestSubarrayWithEqualNumberOfOnesAndTwo {
    public static void main(String[] args) {

    }
    static int zeroTwos(int[] arr){
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int c1 = 0, c0 = 0;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]==0){
                    c0++;
                }else{
                    c1++;
                }
                if(c0==c1){
                    res = Math.max(res,c1+c0);
                }
            }
        }
        return res;
    }











    //efficient solution
    //we convert all the 0 with -1 and the problem becomes same
    //to find the longest sub array with sum zero
    static int ezeroTwos(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                arr[i] = -1;
            }
        }
        int pre_sum=0, res = 0;
        for (int i = 0; i < arr.length; i++) {
             pre_sum += arr[i];
             if(pre_sum==0){
                 res = i+1;
             }
        }
        return res;
    }
}
