package Sorting;


//we not get the correct position of pivot
//but at particular index elements at left and right are
// smaller and greater elements from the pivot
//this method is not stable thats why quick sort is not stable

public class Hoares_Partion {
    public static void main(String[] args) {
        int[] arr = {5,3,8,4,2,7,1,10};
        System.out.println(hoares(arr));

    }
    static int hoares(int[] arr){
        int h = arr.length-1;
        int j = h+1;
        int l = 0;
        int i = l-1;
        int pivot = arr[l];
        while (true){
            do {
                i++;
            }while (arr[i]<pivot);
            do {
                j--;
            }while (arr[j]>pivot);
            if(i>=j){
                return j;
            }
            swap(arr[i],arr[j]);
        }


    }
    static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

    }
}
