package Searching;

public class Two_Pointer {
    public static void main(String[] args) {
        int[] arr = {2,5,8,11,12,30};
        System.out.println(twoPointer(arr,23));


    }
    static boolean twoPointer(int[] arr,int sum){
        int s = 0;
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
