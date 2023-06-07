package LinkedList;

public class Insert_beg_Doubly {
    public static void main(String[] args) {
        Nodedouble head = new Nodedouble(30);
        head.next = new Nodedouble(40);
        head.next.next = new Nodedouble(60);
        head = insertBeg(head,10);
        Nodedouble curr = head;
        while (curr!=null){
            System.out.println(curr.data+" ");
            curr = curr.next;
        }


    }
    static Nodedouble insertBeg(Nodedouble head, int x){
        Nodedouble temp = new Nodedouble(x);
        temp.next = head;
        if(head!=null){
            head.prev = temp;
        }
        return temp;
    }
}

 class Nodedouble {
    int data;
    Nodedouble next;
    Nodedouble prev;
    Nodedouble(int x){
        data = x;
        next = prev = null;
    }
}
