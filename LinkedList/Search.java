package LinkedList;

public class Search {
    public static void main(String[] args) {
        Nodedouble head = new Nodedouble(20);
        head.next = new Nodedouble(30);
        head.next.next = new Nodedouble(10);
        System.out.println(searchEle(head,10));
        System.out.println(rSearch(head,10));

    }
    static int searchEle(Nodedouble head, int x){
        int pos = 1;
        Nodedouble curr = head;
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
    static int rSearch(Nodedouble head, int x){
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
