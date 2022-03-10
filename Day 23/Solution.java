import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

static void levelOrder(Node root){
  // BST - usage of Queues
  // input -> 3, 5, 4, 7, 2, 1
  // upon insertion -> 3 | 2, 5 | 1, 4, 7
  // Add 3 to queue
  // remove 3, print 3
  // add left and right
  // remove 2, print 2
  // add 1 and right (null so nothing is added)
  // remove 5, print 5
  // add 4 and 7...
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
        Node currHead = queue.poll();
        System.out.print(currHead.data + " ");
        if (currHead.left != null) {
            queue.add(currHead.left);
        }
        if (currHead.right != null) {
            queue.add(currHead.right);
        }
    }
    
    
}

public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}