package Recursion;

public class case_letter_permutation {
    public static void main(String[] args) {
        caseletter("","a1b2");

    }
    static void caseletter(String e,String p){
        if(p.isEmpty()){
            System.out.println(e);
            return;
        }
        char temp=p.charAt(0);
        if(Character.isAlphabetic(temp)){
            char lower=(p.toLowerCase()).charAt(0);
            char upper=(p.toUpperCase()).charAt(0);
            caseletter(e+lower,p.substring(1));
            caseletter(e+upper,p.substring(1));
        }else{
            caseletter(e+temp,p.substring(1));
        }
    }
}
