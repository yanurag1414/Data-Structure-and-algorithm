package Arrays;

public class Majority_Elements {
    public static void main(String[] args) {
        int[] arr = {6,8,4,7,8,8,8,8};
        System.out.println(max_element(arr));

    }
    static int max_element(int[] arr){
        int n = arr.length;
        int res = 0;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i]==arr[res]) {
                count++;
            }else {
                count--;
            }
            if (count==0){
                count = 1;
                res = i;
            }
        }
        //if all the elements are negative
        count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[res]) {
                count++;
            }
        }
            if(count <= n/2){
                return -1;
            }
        return res;
        
    }
}
