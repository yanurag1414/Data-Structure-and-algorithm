package LinkedList.CircularLL;


public class cll {
    public static void main(String[] args) {
        //tranversal
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;    //to reference last node to first node


        head = insertBeg(head,60);
        head = einsertBeg(head,70);
        head = insertEnd(head,80);
        head = einsertEnd(head,90);
       head =  delHead(head);

       head = delKth(head,2);


        printList(head);


    }
    static void printList(Node head){
        if(head == null){
            return;
        }
        Node c = head;
        do {
            System.out.print(c.data+" ");
            c = c.next;
        }while (c != head);
    }
    //Naive solution O(n)
    static Node insertBeg(Node head,int x){

        Node temp = new Node(x);
        if(head==null){
            temp.next = temp;
            return temp;
        }else{
            Node curr = head;
            while (curr!=head){
                curr = curr.next;
            }
            curr.next = temp;
            temp.next = head;
            return temp;
        }
    }


    //Efficient solution O(1)
    //we first the element between first and second node
    //then we swap the data of first node with the inserted node
    static Node einsertBeg(Node head , int x){
        Node temp = new Node(x);
        if(head == null){
            temp.next = temp;
            return temp;
        }else {
            temp.next = head.next;
            head.next = temp;
            int t = head.data;
            head.data = temp.data;
            temp.data = t;
            return head;
        }

    }
    //naive solution

    static Node insertEnd(Node head,int x) {
        Node temp = new Node(x);
        if (head == null) {
            temp.next = temp;
            return temp;
        } else {
            Node curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = temp;
            temp.next = head;
            return head;
        }
    }


    static Node einsertEnd(Node head,int x){
        Node temp = new Node(x);
        if(head == null){
            temp.next = temp;
            return temp;
        }else {
            temp.next = head.next;
            head.next = temp;
            int t = head.data;
            head.data = temp.data;
            temp.data = t;
            return temp;
        }
    }




    static Node delHead(Node head){
        if(head==null){
            return null;
        }if (head.next==head){
            return null;
        }
        Node curr =head;
        while (curr.next!=head){
            curr = curr.next;
        }
        curr.next = head.next;
        return curr.next;

    }



    //efficient solution
    static Node edelHead(Node head){
        if(head==null){
            return null;
        }if(head.next==null){
            return null;
        }
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }







    //Delete kth node
    static Node delKth(Node head,int pos){
        if(head==null){
            return head;
        }
        if(pos==1){
            return edelHead(head);
        }else {
            Node curr = head;
            for (int i = 0; i < pos-2; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
            return head;
        }
    }


}
class Node{
    int data;
     Node next;
     Node(int x){
        data = x;
        next = null;
    }
}



