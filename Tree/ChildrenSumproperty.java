package Tree;

public class ChildrenSumproperty {
    public static void main(String[] args) {

    }
    static boolean cSum(Node root){
        if(root == null){
            return true;
        }
        if(root.left == null || root.left == null){
            return true;
        }
        int sum = 0;
        if(root.left != null){
            sum += root.left.key;
        }
        if(root.right != null){
            sum += root.right.key;
        }
        return (root.key==sum && cSum(root.left) && cSum(root.right));
    }

}
