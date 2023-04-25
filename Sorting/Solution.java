package Sorting;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        return kthlarge(nums,k);


    }
    static int ispartition(int[] arr,int l , int h){

        int pivot = arr[h];
        int j = l-1;
        for(int i = l; i<=h-1 ; i++){
            if(arr[i]<pivot){
                i++;
                int temp = arr[j];
                arr[j]  =  arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[j+1];
        arr[j+1] = arr[h];
        arr[h] = temp;
        return j+1;
    }
    static int kthlarge(int[] arr,int k){
            int n = arr.length;
            int l = 0;
            int h = n-1;
            while(l<=h){
                int p = ispartition(arr,l,h);
                if(p==(n-k)){
                    return p;
                }else if(p<(n-k)){
                    l = p+1;
                }else{
                    h = p-1;
                }
            }
            return -1;
            }
    
            
}