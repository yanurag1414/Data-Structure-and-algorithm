package LinkedList.SingleLL;

public class NodeFromEnd {
    public static void main(String[] args) {
        Node head = new Node(20);
        head.next = new Node(30);
      nodeFromEnd(head,1);
       eNodeFromEnd(head,2);
       int x = Integer.MIN_VALUE;
       

    }

    //Naive solution
    static void nodeFromEnd(Node head,int n){
        int len = 0;
        for(Node curr = head ; curr.next!=null ; curr = curr.next){
            len++;
        }
        if(len<n){
            return ;
        }
        Node curr = head;
        for (int i = 0; i < len-n+1; i++) {
            curr = curr.next;
        }
        System.out.println(curr.data);
    }



    //efficient solution
    static void eNodeFromEnd(Node head ,int n){
        if(head == null){
            return;
        }
        Node first = head;
        for (int i = 0; i<n ;i++){
            if(first==null){
                return;
            }
            first = first.next;
        }
        Node second = head;
        while (first!=null){
            second = second.next;
            first = first.next;
        }
        System.out.println(second.data);
    }
}
