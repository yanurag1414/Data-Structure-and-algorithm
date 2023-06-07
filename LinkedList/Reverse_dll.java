package LinkedList;


public class Reverse_dll {
    public static void main(String[] args) {
        Nodedouble head=new Nodedouble(10);
        Nodedouble temp1=new Nodedouble(20);
        Nodedouble temp2=new Nodedouble(30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        head=reverse(head);

        Nodedouble curr = head;
        while (curr!=null){
            System.out.println(curr.data+" ");
            curr = curr.next;
        }


    }
    static Nodedouble reverse(Nodedouble head){
        if(head==null || head.next==null){
            return head;
        }
        Nodedouble prev = null;
        Nodedouble curr = head;
        while (curr!=null){
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;

        }
        return prev.prev;
    }
}
