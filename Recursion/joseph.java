package Recursion;

public class joseph {
    public static void main(String[] args) {
        System.out.println(jos1(6,5));

    }
    //when the number starts from 0
    static int jos(int n,int k){
        if(n==1){
            return 0;
        }
         return  (jos(n-1,k)+k)%n;
    }
    //when the number starts from 1
    //simply make a new function which adds 1 to the above function
    static int jos1(int n,int k){
        return jos(n,k)+1;
    }
}

