package Tree;

import java.util.ArrayList;

public class SizeOfTree {

    static int sizeOFTree(Node root){
        if(root == null){
            return 0;
        }
        else{
            return 1+sizeOFTree(root.left)+sizeOFTree(root.right);
        }
    }
}
