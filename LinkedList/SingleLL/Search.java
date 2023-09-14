package LinkedList.SingleLL;

import java.util.LinkedList;

public class Search {
    public static void main(String[] args) {
        Node head = new Node(20);
        head.next = new Node(30);
        head.next.next = new Node(10);
        System.out.println(searchEle(head,10));
        System.out.println(rSearch(head,10));


    }
    static int searchEle(Node head, int x){
        int pos = 1;
        Node curr = head;
        while (curr!=null){
            if(curr.data==x){
                return pos;
            }else {
                pos++;
                curr = curr.next;
            }
        }
        return -1;
    }












    //recursive method
    static int rSearch(Node head, int x){
        if(head==null){
            return -1;
        }
        if(head.data==x){
            return 1;
        }else {
            int res = rSearch(head.next,x);
            if(res==-1){
                return -1;
            }else {
                return res+1;
            }
        }

    }
}
