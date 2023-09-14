package LinkedList.SingleLL;

public class Intersection {
    public static void main(String[] args) {
        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);
        head1.next.next.next = new Node(40);

        Node head2 = new Node(4);
        head2.next = new Node(8);
        head2.next.next = new Node(30);
        head2.next.next.next = new Node(40);
        System.out.println(extraLength(head1,head2));

    }
    static int extraLength(Node head1,Node head2){
        int d;
        int c1 = lengthOfList(head1);
        int c2 = lengthOfList(head2);
        if(c1>c2){
            d = c1-c2;
            return IntersectionOfTwoNodes(head1,head2,d);
        }else{
            d = c2-c1;
            return IntersectionOfTwoNodes(head2,head1,d);
        }
    }



    static int IntersectionOfTwoNodes(Node head1,Node head2,int d){
        Node curr1 = head1;
        Node curr2 = head2;
        for (int i = 0; i < d; i++) {    //moving pointer to the length  from where
                                      //both the lists have equal length
            if(curr1 == null){
                return -1;
            }
            curr1 = curr1.next;
        }
        while (curr1!=null && curr2 != null){
            if(curr1.data == curr2.data){
                return curr1.data;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return -1;
    }


    static int lengthOfList(Node head){
        int count = 0;
        Node curr = head;
        while (curr!=null){
            count++;
            curr = curr.next;
        }
        return count;
    }
}
