package Arrays;

public class maximum_element {
    public static void main(String[] args) {
        int[] arr = {4,5,7,8,6,4,2};
        System.out.println(max_element(arr));

    }
//    maximum element in array
    static int max_element(int[] arr){
        int l = arr.length;
        int max = 0;
        for (int i = 0; i < l; i++) {
            if(arr[i]>arr[max]){
                max = i;
            }

        }return max;
    }





    //second maximum element in array


    static int max_2_element(int[] arr){
        int max = max_element(arr);
        int l = arr.length;
        int res = -1;
        for (int i = 0; i < l; i++) {
           if(arr[i]!=arr[max]){
               if(res==-1){
                   res = i;
               } else if (arr[i]>arr[res]) {
                   res = i;
               }

           }
        }
        return res;
    }
}
