import java.util.*;
class BinarySearchTrees{
    class Node{
        int data;
        int count;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.count = 1;
            this.left = null;
            this.right = null;
        }
    }

    Node root;
    BinarySearchTrees(){
        this.root = null;
    }

    private  Node insertRec(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(root.data > data){
            root.left = insertRec(root.left, data);
        }
        else if(root.data < data){
            root.right = insertRec(root.right, data);
        }

        else{
            root.count++;
        }

        return root;
    }

    public void insert(int data){
        root = insertRec(root, data);
    }

    
    private void preOrderRec(Node root){
        if(root == null) return;
        System.out.print(root.data + "(" + root.count + ") ");
        inOrderRec(root.left);
        inOrderRec(root.right);
    }
    public void preOrder(){
        preOrderRec(root);
    }

    private void inOrderRec(Node root){
        if(root == null) return;
        inOrderRec(root.left);
        System.out.print(root.data + "(" + root.count + ") ");
        inOrderRec(root.right);
    }

    public void inOrder(){
        inOrderRec(root);
    }

    private void postOrderRec(Node root){
        if(root == null) return;
        inOrderRec(root.left);
        inOrderRec(root.right);
        System.out.print(root.data + "(" + root.count + ") ");
    }
    public void postOrder(){
        postOrderRec(root);
    }
    
    private Node deleteNodeRec(Node root, int key){
        if (root == null) return root;
        if (key < root.data)
            root.left = deleteNodeRec(root.left, key);
        else if (key > root.data)
            root.right = deleteNodeRec(root.right, key);
        
        else if(root.data == key){
            if (root.count > 1){
                (root.count)--;
                return root;
            }
            if (root.left == null){
                Node temp = root.right;
                root=null;
                return temp;
            }
            else if (root.right == null){
                Node temp = root.left;
                root = null;
                return temp;
            }

            Node temp = minValueNode(root.right);
            root.data = temp.data;
            root.count = temp.count;
            root.right = deleteNodeRec(root.right,temp.data);
        }
        return root;
    }
    public void deleteNode(int key){
        root = deleteNodeRec(root, key);
    }

    private Node minValueNode(Node root){
        Node current = root;
        while (current.left != null)
            current = current.left;
 
        return current;
    }
}

public class anrupAss2q1{
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the total number of elements you want to generate: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = ran.nextInt(10, 100);
        }
        
        BinarySearchTrees tree = new BinarySearchTrees();
        for(int i=0; i<arr.length; i++){
            tree.insert(arr[i]);
        }

        boolean bool = true;
        while(bool){
            System.out.println("1. Print original array");
            System.out.println("2. Print PreOrder traversal");
            System.out.println("3. Post InOrder traversal");
            System.out.println("4. Print PostOrder traversal");
            System.out.println("5. Delete an element");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch(ch){
                case 1: System.out.println("Original Array:");
                        for(int i=0; i<arr.length; i++){
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                        break;
                case 2: System.out.println("printing PreOrder Tree");
                        tree.preOrder();
                        System.out.println();
                        break;
                case 3:  System.out.println("printing InOrder Tree");
                        tree.inOrder();
                        System.out.println();
                        break;
                case 4: System.out.println("printing PostOrder Tree");
                        tree.postOrder();
                        System.out.println();
                        break;
                case 5: System.out.print("Enter the element you want to delete: ");
                        int ele = sc.nextInt();
                        tree.deleteNode(ele);
                        System.out.println(ele + " has been deleted");
                        break;
                case 6: bool = false;
                        break;
                default: System.out.println("Invalid Choice!!!");
            }
        }
        sc.close();
    }
}