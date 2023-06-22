package LinkedList.DoublyLL;


public class DelFirstnode {
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        head = delFirst(head);
        head = delLast(head);
        Node curr = head;
        while (curr!=null){

            System.out.println(curr.data+" ");
            curr = curr.next;
        }

    }
    static Node delFirst(Node head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return null;
        }else{
            head = head.next;
            head.prev = null;
            return head;
        }
    }



    static Node delLast(Node head){
        if(head == null){
            return null;
        }
        if(head.next == null) {
            return null;
        }
        else{
            Node curr = head;
            while (curr.next!=null){
                curr = curr.next;
            }
            curr = curr.prev;
            curr.next = null;
            return head;
        }
    }
}
