package Recursion;

public class Tower_of_hanoi {
    public static void main(String[] args) {
        int s=0;
        int h=0;
        int d=0;
        int n=3;
        solver(0,0,0,3);

    }
    static void solver(int s,int d,int h,int n){
        int start=1;
        int help=3;
        int dest=2;
        if(n==1){
            System.out.println("Moving plate "+n+" from "+start+" to "+ dest);
            return;
        }
        solver(s,h,d,n-1);
        System.out.println("Moving plate "+n+" from "+start+" to "+help);
        solver(h,d,s,n-1);
        System.out.println("Moving plate "+n+" from "+help+" to "+dest);
    }
}
