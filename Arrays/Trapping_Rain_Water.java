package Arrays;

public class Trapping_Rain_Water {
    public static void main(String[] args) {
        int[] arr = {5,0,6,2,3};
        System.out.println(Max_Water(arr));

    }
    static int Max_Water(int[] arr){
        int n = arr.length;
        int[] lmax = new int[n];          //make an array for all the elements with their largest left element
        int[] rmax = new int[n];          // make an array for all the elements with their largest right elements
        lmax[0] = arr[0];
        int res = 0;

        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(arr[i],lmax[i-1]);
        }
        rmax[n-1] = arr[n-1];
        for (int i = n-2; i >=0 ; i--) {
            rmax[i] = Math.max(arr[i],rmax[i+1]);
        }
        for (int i = 1; i < n-1; i++) {
            res += Math.min(lmax[i],rmax[i]) - arr[i];
        }
        return res;
    }
}
