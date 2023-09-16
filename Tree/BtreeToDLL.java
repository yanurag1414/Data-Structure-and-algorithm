package Tree;

public class BtreeToDLL {
    public static void main(String[] args) {

    }
    Node prev = null;
     Node BtoDll(Node root){
        if(root == null){
            return root;
        }
        Node head = BtoDll(root.left);
        if(prev==null){
            head = null;
        }else{
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        BtoDll(root.right);
        return head;
    }


}

