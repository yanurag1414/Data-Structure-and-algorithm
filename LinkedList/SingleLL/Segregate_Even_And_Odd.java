package LinkedList.SingleLL;

public class Segregate_Even_And_Odd {
    public static void main(String[] args) {
        Node head = new Node(20);
        head.next = new Node(5);
        head.next.next = new Node(4);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(8);
        head = segEvenOdd(head);
        //printing
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }

    }




    static Node segEvenOdd(Node head){
        Node es = null,ee = null,os = null,oe = null;  //es(even start)  ee(even end)
                                                        //os(odd start)  oe(odd end)
        for (Node curr = head;curr!=null;curr = curr.next){
            int x = curr.data;
            if(x%2==0){
                if(es==null){
                    es = ee = curr;
                }else{
                    ee.next = curr;
                    ee = ee.next;
                }
            }
            else{
                if(os == null){
                    os = oe = curr;
                }else{
                    oe.next = curr;
                    oe = oe.next;
                }
            }
        }
        if(os == null || es==null){
            return head;
        }
        ee.next = os;
        oe.next = null;
        return es;
    }
}
