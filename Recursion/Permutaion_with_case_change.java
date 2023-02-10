package Recursion;

public class Permutaion_with_case_change {
    public static void main(String[] args) {
        casechange("","ab");

    }
    static void casechange(String e,String p){        //only for lower case letters
        if(p.isEmpty()){
            System.out.println(e);
            return;
        }
        char temp=p.charAt(0);
        char ctemp=(p.toUpperCase()).charAt(0);
        casechange(e+temp,p.substring(1));
        casechange(e+ctemp,p.substring(1));
    }

}
