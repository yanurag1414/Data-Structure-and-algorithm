package LinkedList.SingleLL;

import java.util.ArrayList;

public class ReverseIterative {
    public static void main(String[] args) {

    }

    //naive solution
    static Node rever(Node head) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (Node curr = head; curr != null; curr = curr.next) {
            arr.add(curr.data);
        }
        for (Node curr = head; curr != null; curr = curr.next) {
            curr.data = arr.remove(arr.size() - 1);
        }
        return head;
    }


    //efficient solution
    static Node erever(Node head) {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
