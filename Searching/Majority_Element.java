package Searching;
//moores voting algorithm
//we first select the first element of an array and consider is to be the answer
//and set its frequency 1
//then we iterate the array check for the selected item if it is found then we increment the frequency,
//and we there are other element then we decrement the frequency
//if the frequency becomes 0 then we initialize the answer to be ith element and sets its frequency to 1
//the element with frequency greater than 0 must be the answer
//for the surety we check the total frequency of that element by iterating whole array
//if the frequency is  greater than n/2 we simply return that element
public class Majority_Element {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,4,5,6,1,2,1,1,1};
        System.out.println(majorityElement(arr, arr.length));

    }
    static int majorityElement(int[] a, int size)
    {
        // your code here
        int ansIndex = 0;
        int count = 1;
        for(int i = 0;i<size;i++){
            if(a[i]==a[ansIndex]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                ansIndex = i;
                count = 1;
            }
        }
        int count1 = 0;
        for(int i =0;i<size;i++){
            if(a[i]==a[ansIndex]){
                count1++;
            }
        }
        if(count1>(size/2)){
            return a[ansIndex];
        }
        return -1;

    }
}
