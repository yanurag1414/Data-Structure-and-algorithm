package Sorting;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] a = {1,2,4,7,3,6,5};
        int s = 0;
        int e = a.length-1;
        int mid = s+(e-s)/2;
        mergeSort(a,0,e,mid);
        for (int i: a) {
            System.out.print(i+" ");
        }

    }
    static void mergeSort(int[] arr,int s,int e,int mid) {
        int n1 = mid - s + 1;
        int n2 = e - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[s + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + j + 1];
        }
        int i = 0;
        int j = 0;
        int k = s;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
                k++;

            } else {
                arr[k] = right[j];
                j++;
                k++;
            }
        }
        while (i<n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
