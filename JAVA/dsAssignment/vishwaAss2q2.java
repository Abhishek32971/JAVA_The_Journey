import java.util.*;
import java.io.*;

class vishwaAss2q2 {
    public static void main (String[] args) {
        Scanner S = new Scanner(System.in);
        int min = 10;
        int max = 99;
        BST tree=new BST();
        for(int i = 0; i<11;i++){
            double a = Math.random()*(max-min+1)+min;
            int d = (int)a;
            tree.insert(d);
        }
        tree.inorder();
        System.out.println("\n");
        tree.printPostorder();
        System.out.println("\n");
        tree.printPreorder();
        System.out.println("\nEnter the element ot delete: ");
        int key = S.nextInt();
        tree.deleteKey(key);
        System.out.println("\nAfter removing the Element: \n");
        tree.inorder();
        System.out.println("\n");
        tree.printPostorder();
        System.out.println("\n");
        tree.printPreorder();
    }
}

class Node{
    Node left;
    int val;
    Node right;
    Node(int val){
        this.val=val;
    }
}

class BST{
    Node root;
    void deleteKey(int key) { root = deleteRec(root, key); }
    Node deleteRec(Node root, int key)
    {
        if (root == null)
            return this.root;
        if (key < root.val)
            root.left = deleteRec(root.left, key);
        else if (key > root.val)
            root.right = deleteRec(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.val = minValue(root.right);
            root.right = deleteRec(root.right, root.val);
        }

        return root;
    }

    int minValue(Node root)
    {
        int minv = root.val;
        while (root.left != null) {
            minv = root.left.val;
            root = root.left;
        }
        return minv;
    }

    public void insert(int key){
        Node node=new Node(key);
        if(root==null) {
            root = node;
            return;
        }
        Node prev=null;
        Node temp=root;
        while (temp!=null){
            if(temp.val>key){
                prev=temp;
                temp=temp.left;
            }
            else if (temp.val<key){
                prev=temp;
                temp=temp.right;
            }
        }
        if(prev.val>key)
            prev.left=node;
        else prev.right=node;
    }

    public void inorder(){
        Node temp=root;
        Stack<Node> stack=new Stack<>();
        while (temp!=null||!stack.isEmpty()){
            if(temp!=null){
                stack.add(temp);
                temp=temp.left;
            }
            else {
                temp=stack.pop();
                System.out.print(temp.val+" ");
                temp=temp.right;
            }
        }
    }
    void printPostorder(Node node)
    {
        if (node == null)
            return;
        System.out.print(node.val + " ");
        printPostorder(node.left);
        printPostorder(node.right);
    }
    void printPostorder() { printPostorder(root); }
    void printPreorder(Node node)
    {
        if (node == null)
            return;
        System.out.print(node.val + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
    void printPreorder() { printPreorder(root);}
}