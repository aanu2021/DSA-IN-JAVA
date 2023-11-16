import java.io.*;
import java.util.*;

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

    public static Node insertIntoBST(Node root, int val){
        if(root == null){
            return new Node(val);
        }
        if(root.data > val){
            root.left = insertIntoBST(root.left, val);
        }
        else{
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean searchInBST(Node root, int target){
        if(root == null) return false;
        if(root.data == target) return true;
        if(root.data > target) return searchInBST(root.left, target);
        else return searchInBST(root.right, target);
    }

    public static Node deleteNode(Node root){
        if(root.left == null) return root.right;
        if(root.right == null) return root.left;
        Node leftSubtree = root.left;
        Node rightSubtree = root.right;
        root.right = null;
        while(leftSubtree != null && leftSubtree.right != null){
            leftSubtree = leftSubtree.right;
        }
        leftSubtree.right = rightSubtree;
        return root.left;
    }

    public static Node deleteInBST(Node root, int target){
        if(root == null) return root;
        if(root.data == target){
            root = deleteNode(root);
            return root;
        }
        Node node = root;
        while(node != null){
            if(node.data > target){
                if(node.left != null && node.left.data == target){
                    node.left = deleteNode(node.left);
                    return root;
                }
                else{
                    node = node.left;
                }
            }
            else{
                if(node.right != null && node.right.data == target){
                    node.right = deleteNode(node.right);
                    return root;
                }
                else{
                    node = node.right;
                }
            }
        }
        return root;
    }

    public static void main(String[] args){
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = insertIntoBST(root, values[i]);
        }
        inorder(root);
        System.out.println("");
        root = deleteInBST(root,1);
        inorder(root);
        System.out.println("");
    }
}


/*

       5
      / \
     1   7
      \
       3
      / \
     2   4 


*/    