package Tree;

public class Height {
    public static void main(String[] args) {

    }
    static int heightOftree(Node root){
        if(root == null){
            return 0;
        }else{
            return Math.max(heightOftree(root.left),heightOftree(root.right))+1;
        }
    }
}
