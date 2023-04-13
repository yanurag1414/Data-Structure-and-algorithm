package Arrays;

public class Frequency_in_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,4,4,4};
        freq(arr);

    }
    static void freq(int[] arr) {
        int len = arr.length;
        int freq = 1;
        int i = 1;
        while (i < len) {
            while (i < len && arr[i] == arr[i - 1]) {
                freq++;
                i++;
            }
            System.out.println(arr[i-1] + " " + freq);
            i++;
            freq = 1;          //resetting frequency for next element
        }

        if(len==1 || arr[len-1] != arr[len-2]){       //for the last element
            System.out.println(arr[len-1]+" "+1);
        }
    }
}
