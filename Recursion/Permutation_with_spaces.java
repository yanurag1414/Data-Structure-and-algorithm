
package Recursion;

import java.util.ArrayList;

public class Permutation_with_spaces {
    public static void main(String[] args) {
        pstring("","ABC");

    }
    static void pstring(String e,String p){
        char t=p.charAt(0);
        String address="";
        address.replace(".","[.]");
        e+=t;
        p.substring(1);
        if(p.isEmpty()){
            System.out.println(e);
            return;
        }
        char temp=p.charAt(0);
        pstring(e+"_"+temp,p.substring(1));
        pstring(e+temp,p.substring(1));
    }
}
