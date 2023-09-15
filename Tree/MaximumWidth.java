package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidth {
    public static void main(String[] args) {

    }

    static int maxWidth(Node root){
        if(root == null){
            return 0;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int res = 0;
        while(!q.isEmpty()){
            int count = q.size();
            res = Math.max(count,res);
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return res;
    }
}
