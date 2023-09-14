package LinkedList.SingleLL;


import java.util.HashSet;
import java.util.LinkedList;

public class DetectLoop {
    public static void main(String[] args) {
        

    }
    static boolean isLoop(Node head){
        HashSet<Node> s = new HashSet<>();
        for (Node curr = head ; curr!=null;curr = curr.next){
            if (s.contains(curr)){
                return true;
            }
            s.add(curr);
        }
        return false;
    }





    //using floyd triangle
    static boolean fIsLoop(Node head){
        Node curr_slow = head;
        Node curr_fast = head;
        while (curr_fast != null && curr_fast.next != null){
            curr_slow = curr_slow.next;
            curr_fast = curr_fast.next.next;
            if(curr_slow==curr_fast){
                return true;
            }
        }
        return false;
    }






    //detect and delete the loop 
    static void sLoop(Node head){
        Node curr_slow = head;
        Node curr_fast = head;
        while (curr_fast != null && curr_fast.next != null){
            curr_slow = curr_slow.next;
            curr_fast = curr_fast.next.next;
            if(curr_slow==curr_fast){
                break;
            }
        }
        if(curr_slow!=curr_fast){
            return ;
        }
        curr_slow = head;
        while (curr_fast.next != curr_slow.next){
            curr_slow = curr_slow.next;
            curr_fast = curr_fast.next;
        }
        curr_fast.next = null;

    }
}
