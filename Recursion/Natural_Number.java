package Recursion;

public class Natural_Number {
    public static void main(String[] args) {
        naturalnumbers(5);
        revnaturalnum(5);

    }
    static void naturalnumbers(int n){
        if(n==0){
            return;
        }
        naturalnumbers(n-1);
        System.out.print(n+" ");
        System.out.println();       //for line change
    }
    static void revnaturalnum(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        revnaturalnum(n-1);

    }

}
