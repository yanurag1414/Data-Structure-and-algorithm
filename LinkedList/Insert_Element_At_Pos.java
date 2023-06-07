package LinkedList;


public class Insert_Element_At_Pos {
    public static void main(String[] args) {
        Nodedouble head = new Nodedouble(20);
        head.next = new Nodedouble(30);
        head.next.next = new Nodedouble(40);
        head.next.next.next = new Nodedouble(50);
        head = insetAtpos(1,10,head);
        Nodedouble curr = head;
        while (curr!=null) {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }


    }





    static Nodedouble insetAtpos(int pos, int data, Nodedouble head){
        Nodedouble temp = new Nodedouble(data);
        if(pos==1){
            temp.next = head;
            return temp;
        }
        Nodedouble curr = head;
        for (int i = 1; i < pos-1 && curr!=null; i++) {
            curr = curr.next;
            if(curr==null){
                return head;
            }
        }

        temp.next = curr.next;
        curr.next = temp;
        return head;
    }
}
