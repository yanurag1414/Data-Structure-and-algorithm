package LinkedList.SingleLL;

public class Insert_Sorted {
    public static void main(String[] args) {

    }
    static Node insertSorted(int x,Node head){
        Node temp = new Node(x);
        if(head==null){
            return temp;
        }if(x< head.data){
            temp.next = head;
            return temp;
        }
        Node curr = head;
        while (curr.next!=null && curr.next.data<x){
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }
}
