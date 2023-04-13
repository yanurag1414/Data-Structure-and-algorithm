package Arrays;

public class Leaders_in_array {
    public static void main(String[] args) {
        int[] arr = {7,10,4,3,6,5,2};
        Leaders(arr);

    }
    static void Leaders(int[] arr){          //elements are printing from last
        int n = arr.length;
        int current_leader = arr[n-1];
        System.out.println(current_leader);
        for (int i = n-2; i >= 0; i--) {
            if(current_leader<arr[i]){
                current_leader = arr[i];
                System.out.println(current_leader);
            }
        }
    }
}
