package Tree;

public class Btree {
    public static void main(String[] args) {
        Node first = new Node(10);
        first.left = new Node(20);
        first.right = new Node(30);

    }

}
class Node{
    int key;
    Node left;
    Node right;
    Node(int k){
        key = k;
    }
}
