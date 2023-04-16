package Searching;

public class Serching_Infinite_Size_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 40, 50};

        int x = 3;

        System.out.println(isearch(arr,x));

    }
    static int isearch(int[] arr,int num){
        if(arr[0]==num){
            return 0;
        }
        int i = 1;
        while (arr[i]<num) {
            i *= 2;
            if (arr[i] == num) {
                return i;
            }


        }
        return bSearch(arr,num,i/2+1,i-1);
    }
    static int bSearch(int[] arr,int num,int start,int end){
        start= 0;
        end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)%2;
            if(arr[mid]==num){
                return mid;
            } else if (arr[mid]<num) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
}
