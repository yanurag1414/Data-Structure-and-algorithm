package LinkedList.SingleLL;

public class MergeSorted {
    public static void main(String[] args) {
        Node a=new Node(10);
        a.next=new Node(20);
        a.next.next=new Node(30);
        Node b=new Node(5);
        b.next=new Node(35);
        Node curr = mergeSorted(a,b);
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }

    }
    static Node mergeSorted(Node a,Node b){
        if(a==null){
            return b;
        }
        if(b == null){
            return a;
        }
        Node head = null,tail = null;
        if(a.data <= b.data){
            head = tail = a;
            a = a.next;
        }else{
            head = tail = b;
            b= b.next;
        }

        while (a!=null && b!=null){
            if(a.data <= b.data){
                tail.next = a;
                tail = a;
                a = a.next;
            }else {
                tail.next = b;
                b = b.next;
            }
        }
        if(a==null){
            tail.next = b;
        }else{
            tail.next = a;
        }
        return head;
    }
}
