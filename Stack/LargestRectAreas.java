package Stack;

import java.util.Stack;

public class LargestRectAreas {
    public static void main(String[] args) {
        int[] arr = {6,2,5,4,1,5,6};
        int n = arr.length;
        System.out.println(largestArea(arr,n));

    }
    static int largestArea(int[] arr,int n){
        Stack<Integer> s = new Stack<>();
        int res = 0;
        int tp;
        int curr;
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[s.peek()]>=arr[i]){
                 tp = s.peek();
                 s.pop();
                 curr = arr[tp]*(s.isEmpty()?i:(i-s.peek()-1));
                res = Math.max(res,curr);
            }
            s.add(i);
        }
        while (!s.isEmpty()){
             tp = s.peek();
             s.pop();
             curr = arr[tp]*(s.isEmpty()?n:(n-s.peek()-1));
             res = Math.max(res,curr);
        }
        return res;
    }
}
