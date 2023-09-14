package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {

    }
    static void levelTraversal(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        //adding the root of the every step and printing it
        //and then checking for its child
        while (!q.isEmpty()){
            Node curr = q.poll();
            System.out.println(curr.key+" ");
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
    }
}
