package LinkedList;

public class DelFirstnode {
    public static void main(String[] args) {
        Nodedouble head=new Nodedouble(10);
        Nodedouble temp1=new Nodedouble(20);
        Nodedouble temp2=new Nodedouble(30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        head = delFirst(head);
        head = delLast(head);
        Nodedouble curr = head;
        while (curr!=null){

            System.out.println(curr.data+" ");
            curr = curr.next;
        }

    }
    static Nodedouble delFirst(Nodedouble head){
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



    static Nodedouble delLast(Nodedouble head){
        if(head == null){
            return null;
        }
        if(head.next == null) {
            return null;
        }
        else{
            Nodedouble curr = head;
            while (curr.next!=null){
                curr = curr.next;
            }
            curr = curr.prev;
            curr.next = null;
            return head;
        }
    }
}
