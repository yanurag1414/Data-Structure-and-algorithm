package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SpiralTraversal {
    public static void main(String[] args) {

    }
    static void printSpiral(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        boolean reverse = false;
        q.add(root);
        while (!q.isEmpty()){
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                if(reverse){
                    s.push(curr.key);
                }else{
                    System.out.println(curr.key+" ");
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            if(reverse){
                while (!s.isEmpty()){
                    System.out.println(s.pop()+" ");
                }
            }
            reverse = !reverse;
            System.out.println();
        }

    }




    //method 2
    static void eprintSpiral(Node root){
        if(root == null){
            return;
        }
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.add(root);
        while (!s1.isEmpty() || !s2.isEmpty()){
            while (!s1.isEmpty()){
                Node temp = s1.peek();
                s1.pop();
                System.out.println(temp.key);
                if(temp.right!=null){
                    s2.add(temp.right);
                }
                if(temp.left!=null){
                    s2.add(temp.right);
                }
            }
            while (!s2.isEmpty()){
                Node temp = s2.peek();
                s2.pop();
                System.out.println(temp.key);
                if(temp.left!=null){
                    s1.add(temp.left);
                }
                if(temp.right!=null){
                    s1.add(temp.right);
                }
            }

        }
    }
}
