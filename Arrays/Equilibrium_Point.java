package Arrays;

public class Equilibrium_Point {
    public static void main(String[] args) {
        int[] arr = {3,4,8,-9,9,7};
        System.out.println(equiPoint(arr));

    }
    static boolean equiPoint(int[] arr){
        int n = arr.length;
        int rs = 0;  //right sum
        for (int i = 0; i < n; i++) {
            rs += arr[i];
        }
        int ls = 0;  //left sum
        for (int i = 0; i < n; i++) {
            rs -= arr[i];
            if(rs == ls){
                return true;
            }else {
                ls += arr[i];
            }
        }
        return false;
    }
}
