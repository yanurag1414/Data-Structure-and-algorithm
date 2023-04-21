package Sorting;

public class Lomato_Partition {
    public static void main(String[] args) {
        int[] arr = {10,80,30,90,60,70};
        System.out.println(lomato(arr));

    }

    static int lomato(int[] arr) {
        int h = arr.length - 1;
        int l = 0;
        int pivot = arr[h];
        int i = l - 1;
        for (int j = l; j < h - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr[i], arr[j]);
            }
        }
        swap(arr[i+1],arr[h]);
        return 1+1;
    }

    static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

    }
}
