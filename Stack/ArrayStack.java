package Stack;

import java.util.ArrayList;

public class ArrayStack {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());

    }
}
//class MyStack{
//    int arr[];
//    int cap;     //capacity
//    int top;
//    MyStack(int c){
//        top = -1;    //initializing top index
//        cap = c;
//        arr = new int[cap];  //creating an array of size capacity
//    }
//    void push(int x){
//        top++;           //initial index is -1, so we add 1 to index
//                        // and add an element to that position
//        arr[top] = x;
//    }
//    int pop(){
//        int res = arr[top];   //we have to return the deleted item
//                                //stores in res
//        top--;
//        return res;
//    }
//    int size(){
//        return top+1;
//    }
//    boolean isEmpty(){
//        return (top == -1);
//    }
//}
class MyStack{
    ArrayList<Integer> al = new ArrayList<>();

    void push(int x){
        al.add(x);
    }
    int pop(){
        int res = al.get(al.size()-1);
        al.remove(al.size()-1);
        return res;
    }
    int peek(){
       return al.get(al.size()-1);
    }
    boolean isEmpty(){
        return al.isEmpty();
    }
    int size()
    {
        return al.size();
    }

}
