package LinkedList.SingleLL;

public class ReverseKth {
    public static void main(String[] args) {

    }
    static Node reverseK(Node head,int k){
        Node curr = head;
        Node prev = null;
        Node next = null;
        int count = 0;
        while (curr!=null && count<k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if(next!=null){
            Node rest_head = reverseK(next,k);
            head.next = rest_head;
        }
        return prev;
    }
}
