package LinkedList.DoublyLL;


public class Insert_Element_At_Pos {
    public static void main(String[] args) {
       Node head = new Node(20);
        head.next = new Node(30);
        head.next.next = new Node(40);
        head.next.next.next = new Node(50);
        head = insetAtpos(1, 10, head);
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }


    }


    static Node insetAtpos(int pos, int data, Node head) {
        Node temp = new Node(data);
        if (pos == 1) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for (int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
            if (curr == null) {
                return head;
            }
        }

        temp.next = curr.next;
        curr.next = temp;
        return head;
    }
}
