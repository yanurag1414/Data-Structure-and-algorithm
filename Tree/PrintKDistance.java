package Tree;

public class PrintKDistance {
    public static void main(String[] args) {

    }
    static void printKNodes(Node root,int k){
        if(root == null){
            return;
        }
        if(k==0){
            System.out.println(root.key+" ");
            printKNodes(root.left,k-1);
            printKNodes(root.right,k-1);
        }

    }
}
