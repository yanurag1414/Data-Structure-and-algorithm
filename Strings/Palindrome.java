package Strings;

import javax.sql.rowset.serial.SerialStruct;

public class Palindrome {
    public static void main(String[] args) {
        String s = "Ama";
        System.out.println(isPalindrome(s));
        System.out.println(eisPalimdrome(s));
    }
    //naive method
    static boolean isPalindrome(String s){

        StringBuilder rev = new StringBuilder(s);
        rev.reverse();
        return s.contentEquals(rev);
    }






    //efficient solution
    static boolean eisPalimdrome(String str){
        int n = str.length();
        int start = 0;
        int end = n-1;
        while (start<end) {
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            end--;
            start++;
        }
        return true;
    }
}
