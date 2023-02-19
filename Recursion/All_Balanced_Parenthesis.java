package Recursion;

public class All_Balanced_Parenthesis {
    public static void main(String[] args) {
        all_Parenthesis("",3,3);

    }
    static void all_Parenthesis(String e,int o,int c){
        if(o==0 && c==0){
            System.out.println(e);
            return;
        }
        if(o!=0){
            all_Parenthesis(e+"(",o-1,c);
        }
        if(o<c){
            all_Parenthesis(e+")",o,c-1);
        }
    }
}
