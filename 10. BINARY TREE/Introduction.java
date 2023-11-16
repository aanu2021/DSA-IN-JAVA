import java.io.*;
import java.util.*;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Introduction{

    static int idx = 0;

    public static Node BuildBinaryTree(int nodes[]){
        if(idx == nodes.length) return null;
        if(nodes[idx] == -1){
            idx++;
            return null;
        }
        Node root = new Node(nodes[idx++]);
        root.left = BuildBinaryTree(nodes);
        root.right = BuildBinaryTree(nodes);
        return root;
    }

    public static void preorder(Node root){
        if(root == null) return;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }

    public static void levelorder(Node root){
        if(root == null) return;
        Queue<Node>q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int sz = q.size();
            while(sz > 0){
               Node node = q.peek();
               sz--;
               q.remove();
               System.out.print(node.data + " ");
               if(node.left != null) q.add(node.left);
               if(node.right != null) q.add(node.right);
            }
            System.out.println(""); 
        }
    }

    public static int countOfNodes(Node root){
        if(root == null) return 0;
        return 1 + countOfNodes(root.left) + countOfNodes(root.right);
    }

    public static int sumOfNodes(Node root){
        if(root == null) return 0;
        return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
    }

    public static int height(Node root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static int maxDiameter = 0;

    public static int diameter(Node root){
        if(root == null) return 0;
        int leftLongestPath = diameter(root.left);
        int rightLongestPath = diameter(root.right);
        maxDiameter = Math.max(maxDiameter, 1 + leftLongestPath + rightLongestPath);
        return 1 + Math.max(leftLongestPath, rightLongestPath);
    }

    public static void main(String[] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = BuildBinaryTree(nodes);
        diameter(root);
        System.out.println(maxDiameter);
    }
}

/*

      1
     / \
    2   3 
   / \   \
  4   5   6


*/