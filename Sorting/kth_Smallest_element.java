package Sorting;

public class kth_Smallest_element {
    public static void main(String[] args) {
        int[] arr = {10,4,5,8,11,6,26};

        int index = kSmallNum(arr,5);
        System.out.println(arr[index]);



    }
    static int kSmallNum(int[] arr,int k){
        int n = arr.length;
        int l = 0;
        int h = n-1;
        while(l<=h){
            int p = ispartiotion(arr,l,h);
            if(p==k-1){
                return p;
            } else if (p<k-1) {
                l = p+1;
            }else{
                h = p-1;
            }
        }
        return -1;
    }
    static int ispartiotion(int[] arr,int l ,int h){
        int i = l-1;
        int pivot = arr[h];
        for (int j = l; j <= h-1 ; j++) {
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }

        }
        int temp = arr[i+1];
        arr[i+1] = arr[h];
        arr[h] = temp;
        return i+1;

    }

}

