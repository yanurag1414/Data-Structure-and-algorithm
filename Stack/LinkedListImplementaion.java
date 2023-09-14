package Stack;

public class LinkedListImplementaion {
    public static void main(String[] args) {

    }

}
class Node {
    int data;
    Node next;
    Node (int d){
        data = d;
        next = null;
    }
}
class Stack{
    Node head;
    int size;
    Stack(){
        head = null;
        size = 0;
    }
    int pop(){
        if(head==null){
            return Integer.MAX_VALUE;
        }
        int res = head.data;
        Node temp = head;
        head = head.next;
        size--;
        return res;
    }
    int peak(){
        if(head==null){
            return Integer.MAX_VALUE;
        }
        return head.data;
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        return head==null;
    }

}
