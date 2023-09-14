package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParenthesis {
    public static void main(String[] args) {

    }
  static   boolean matching(char a,char b)
  {

        return (a=='(' && b == ')')|| (a=='[' && b == ']')||(a=='{' && b=='}');
  }
    static boolean isBalnced(String str){
        Deque<Character> s = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if(x=='(' || x=='{' || x=='['){
                s.push(x);
            }else{
                if(s.isEmpty()){
                    return false;
                } else if (!matching(s.peek(),x)){
                    return false;
                }
                else {
                    s.pop();
                }
            }
        }
        return (str.isEmpty());
    }
}

