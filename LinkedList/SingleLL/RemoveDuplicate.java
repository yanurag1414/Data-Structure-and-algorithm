package LinkedList.SingleLL;

import java.util.ArrayList;
import java.math.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();

    }
    static void removeDup(Node head){
        Node curr = head;
        while (curr!=null && curr.next!=null){
            if(curr.data==curr.next.data){
                curr = curr.next.next;
            }else{
                curr = curr.next;

            }
        }
    }
}
