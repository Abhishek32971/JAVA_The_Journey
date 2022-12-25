import java.util.*;
class StackLklst{
    Node head=null;
    class Node{
        int data;
        Node next;
        Node(int ele){
            data=ele;
            next=null;
        }
    }
    void push(int ele){
        if(head==null){
            Node newnode=new Node(ele);
            head=newnode;
        }
        else{
            Node newnode=new Node(ele);
            newnode.next=head;
            head=newnode;
        }
    }
    int peek(){
        return head.data;
    }
    int pop(){
        if(head==null){
            System.out.println("underflow");
            return -1;
        }
        int d=head.data;
        head=head.next;
        return d;
    }
    void diaplay(){
        if(head==null){
            System.out.println("nothing here ");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
}
public class program6 {
    public static void main(String[] args) {
        StackLklst SL=new StackLklst();
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        while(flag){
            System.out.println("\n welcome\n1.push\n2.pop\n3.peek\n4.display\n5.exit");
            int c=sc.nextInt();
            switch(c){
                case 1:int ele=sc.nextInt();
                       SL.push(ele);
                       break;
                case 2:System.out.println(SL.pop());
                       break;
                case 3:System.out.println(SL.peek());
                       break;
                case 4:SL.diaplay();
                       break;
                case 5:flag=false;
                       break;
            }
        }
    }
    
}
