package LinkedList.CircularLL.Doubly;

public class Insert_beg_Doubly {
    public static void main(String[] args) {
        Node head = new Node(30);
        head.next = new Node(40);
        head.next.next = new Node(60);
        head = insertBeg(head,10);
        head = inserLast(head,50);
        Node curr = head;
        while (curr!=null){
            System.out.println(curr.data+" ");
            curr = curr.next;
        }


    }
    static Node insertBeg(Node head, int x){
        Node temp = new Node(x);
        temp.next = head;
        if(head!=null){
            head.prev = temp;
        }
        return temp;
    }
    static Node inserLast(Node head, int x){
        Node temp = new Node(x);
        if(head==null){
            return temp;
        }
        Node curr = head;
        while (curr.next!=null){
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;
    }
}

 class Node {
    int data;
    Node next;
    Node prev;
    Node(int x){
        data = x;
        next = prev = null;
    }
}
