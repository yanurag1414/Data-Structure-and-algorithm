package Recursion;

public class Substring {
    public static void main(String[] args) {
        substrng("","abc");

    }
    static void substrng(String p,String s){           //p is empty string
        if(s.isEmpty()){
            System.out.println(p);
            return ;
        }
        char temp=s.charAt(0);
        substrng(p+temp,s.substring(1));
        substrng(p,s.substring(1));
    }

}
