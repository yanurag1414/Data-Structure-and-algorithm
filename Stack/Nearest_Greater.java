package Stack;

import java.sql.Array;
import java.util.Stack;

public class Nearest_Greater {
    public static void main(String[] args) {



    }


    //Nearest left greater element
    static void printPrevious(int arr[]{
        Stack<Integer> s = new Stack<>();
        s.push(arr[0]);
        for (int i = 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[i]>=s.peek()){
                s.pop();
            }
            int pg = s.isEmpty()?-1:s.peek();
            System.out.println(pg);
            s.push(arr[i]);

        }
    }


    //Nearest right greater element
    static void printNext(int arr[]) {
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        s.push(arr[n-1]);
        for (int i = n-2; i >= 0; i++) {
            while (!s.isEmpty() && arr[i] >= s.peek()) {
                s.pop();
            }
            int pg = s.isEmpty() ? -1 : s.peek();
            System.out.println(pg);
            s.push(arr[i]);
        }
    }


}
