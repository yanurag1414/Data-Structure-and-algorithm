package LinkedList.SingleLL;

public class Palindrome {
    public static void main(String[] args) {

    }
    static boolean isPalindrome(Node head){
        if(head == null){
            return true;
        }
        Node slow = head , fast = head;
        while (slow.next!=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node rev = reverseList(slow.next);
        Node curr = head;
        while (rev!=null){
            if(rev.data != curr.data){
                return false;
            }
            curr = curr.next;
            rev = rev.next;
        }
        return true;
    }
  static   Node reverseList(Node head){
        Node curr = head;
        Node prev = null;
        while (curr!=null){
            Node next = curr.next;
            prev = curr;
            curr = next;

        }
        return prev;
    }
}
