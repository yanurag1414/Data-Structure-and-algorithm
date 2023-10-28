package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class traversal {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        String s = "anurag";


    }


    //Inorder Traversal\
    static void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.println(root.key+ " ");
            inorder(root.right);
        }
    }



    //Preorder Traversal
    static void preorder(Node root){
        if(root != null){
            System.out.println(root.key+" ");
            preorder(root.left);
            preorder(root.right);
        }

    }


    //postorder traversal
    static void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.key+" ");
        }
    }


    //Level order traversal
    static void levelTraversal(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                assert curr != null;
                System.out.print(curr.key+" ");
                if(curr.left!=null){
                    q.add(curr.left);
                }if(curr.right != null){
                    q.add(curr.right);
                }

            }
            System.out.println();
        }
    }
}
