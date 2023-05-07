package Sorting;

public class Sorting_Two_Types {
    public static void main(String[] args) {
        int[] arr = {-12,18,-10,15};
        sortTwo(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    static void sortTwo(int[] arr){
        int l = -1;
        int n = arr.length;
        int h = n;
        while (true) {
            do {
                l++;
            } while (arr[l] < 0);
            do {
                h--;
            } while (arr[h] >= 0);
            if(l>=h){
                return;
            }
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
        }

    }
}
