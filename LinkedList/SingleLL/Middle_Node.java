package LinkedList.SingleLL;

public class Middle_Node {
    public static void main(String[] args) {
        Node head = new Node(20);
        head.next = new Node(30);
        head.next.next = new Node(10);
        midNode(head);
        emidNode(head);

    }
    //naive method
    static void midNode(Node head) {
        if (head == null) {
            return;
        }
        int count = 0;
        Node curr = head;
        while (curr.next!=null){
            count++;
            curr = curr.next;
        }
        curr = head;
        for (int i = 0; i < count/2; i++) {
            curr = curr.next;
        }
        System.out.println(curr.data);
    }






    //efficient solution
    static void emidNode(Node head){
        if(head == null){
            return;
        }
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);

    }

}
