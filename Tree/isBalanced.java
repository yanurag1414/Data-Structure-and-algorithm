package Tree;

import static Tree.Height.heightOftree;

public class isBalanced {
    public static void main(String[] args) {

    }
    //Naive Solution
    boolean isBal(Node root){
        if(root==null){
            return true;
        }
        int lh = heightOftree(root.left);
        int rh = heightOftree(root.right);
        return Math.abs(lh-rh)<=1 && isBal(root.right) && isBal(root.left);
    }



    //Efficient solution
    int isBalnced(Node root){
        if(root == null){
            return 0;
        }
        int lh = isBalnced(root.left);
        if(lh==-1){
            return -1;
        }
        int rh = isBalnced(root.right);
            if(rh==-1){
                return -1;
            }
        if(Math.abs(lh-rh)>1){
            return -1;
        }else{
            return Math.max(lh,rh)+1;
        }

    }

}
