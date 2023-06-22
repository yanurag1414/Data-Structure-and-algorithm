package LinkedList.Doubly_Circular_ll;

public class DoubleCircularLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node n1 = new Node(20);
        head.next = n1;
        n1.prev = head;
        Node n2 = new Node(30);
        n1.next = n2;
        n2.prev = n1;
        Node n3 = new Node(40);
        n3.prev = n2;
        n2.next = n3;
        head.prev = n3;
        n3.next = head;
        head = insertAtBeg(head,5);
        printlist(head);






    }



    public static void printlist(Node head){
        if(head==null)return;
        Node r=head;
        do{
            System.out.print(r.data+" ");
            r=r.next;
        }while(r!=head);
    }



    //insert at the beginning
    static Node insertAtBeg(Node head , int x){
        Node temp = new Node(x);
        if(head == null){
            temp.prev =temp;
            temp.next = temp;
            return temp;
        }
        temp.prev = head.prev;
        temp.next = head;
        head.prev.next = temp;
        head.prev = temp;
        return temp;
    }

}
class Node{
    int data;
    Node next;
    Node prev;
    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}
