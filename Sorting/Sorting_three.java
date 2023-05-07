package Sorting;

public class Sorting_three {
    public static void main(String[] args) {
        int[] arr = {0,1,2,1,0,1,2};
        sortThree(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void sortThree(int[] arr){
        int n = arr.length;
        int l = 0;
        int mid = 0;
        int h = n-1;
        while (mid<=h){
            if(arr[mid]==0){    //we trying to maintain zero at index l
                int temp = arr[l];
                arr[l] = arr[mid];
                arr[mid] = temp;
                l++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;
            }else {
                int temp = arr[mid];
                arr[mid]= arr[h];
                arr[h] = temp;
                h--;
            }
        }
    }
}
