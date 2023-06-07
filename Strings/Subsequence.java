package Strings;

public class Subsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abcd","abc"));
        System.out.println(rIsSubsequence("abcd","abc",4,3));

    }
    static boolean isSubsequence(String a,String b){
        int n = a.length();
        int m = b.length();
        int j = 0;
        for (int i = 0; i < n && j<m; i++) {
            if(a.charAt(i)==b.charAt(j)){
                j++;
            }
        }
        return (m==j);
    }








    //by recursion
    static boolean rIsSubsequence(String a,String b , int n, int m){
        if(m==0){
            return true;
        }
        if(n==0){
            return false;
        }
        if(a.charAt(n-1)==b.charAt(m-1)){
            return rIsSubsequence(a,b,n-1,m-1);
        }else {
            return rIsSubsequence(a,b,n-1,m);
        }
    }
}
