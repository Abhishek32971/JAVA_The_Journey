import java.util.*;

class Stack{
    char[] arr;
    int i;
    int size;

    Stack(int size){
        this.arr = new char[size];
        this.i = 0;
        this.size = size;
    }

    public void push(char ch){
        arr[i] = ch;
        i++;
    }

    public char pop(){
        char ch = arr[i-1];
        i--;
        return ch;
    }

    public boolean isEmpty(){
        return i == 0;
    }
}

class Queue{
    class Node{
        String str;
        Node next;
        Node(String str){
            this.str = str;
            this.next = null;
        }
    }

    Node head;
    public int size;
    Queue(){
        size = 0;
        head = null;
    }

    public void push(String str){
        Node newNode = new Node(str);
        if(head == null) head = newNode;
        else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void printQueue(){
        Node currNode = head;
        System.out.print("[");
        while(currNode.next != null){
            System.out.print(currNode.str + ",");
            currNode = currNode.next;
        }
        System.out.println(currNode.str+"]");
    }

    public void reportPalindWord(){
        Node currNode = head;
        while(currNode != null){
            String str = currNode.str;
            Stack st = new Stack(str.length());
            String reverseString = "";
            for(int i=0; i<str.length(); i++){
                st.push(str.charAt(i));
            }
            while(!st.isEmpty()){
                reverseString = reverseString + st.pop();
            }
            if(str.equals(reverseString)){
                System.out.println(str + " is a palindrome.");
            }
            currNode = currNode.next;
        }
    }
}

public class anrupAss2q2{
    public static void main(String[] args) {
        Queue li = new Queue();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println();
            System.out.println("1. Push word to Queue");
            System.out.println("2. Print Queue");
            System.out.println("3. Search for Palindrome words");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch(ch){
                case 1: System.out.print("Enter the word: ");
                        String st = sc.next();
                        li.push(st);
                        break;
                case 2: li.printQueue();
                        break;
                case 3: li.reportPalindWord();
                        break;
                case 4: System.out.println();
                        flag = false;
                        break;
                default: System.out.println("invalid choice");
                        break;
            }
        }
        sc.close();
    }
}