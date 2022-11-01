
import java.util.*;

class SinglyLinkedList {
    public class Node{
        int data;
        Node link;
        Node(int d){
            data=d;
            link=null;
        }
    }
    Node head=null;
    public void addFirst(int d){
        Node newnode=new Node(d);
        if(head==null){
            head=newnode;
        }
        else{
            newnode.link=head;
            head=newnode;
        }
    }
    public void addLast(int d){
        Node newnode=new Node(d);
        if(head==null){
            head=newnode;
        }
        else{
            Node temp=head;
            while(temp.link!=null){
                temp=temp.link;
            }
            temp.link=newnode;
        }
    }
    public void display(){
        if(head==null){
            System.out.println("no elements in list");
            return;
        }
        else{
            Node temp=head;
            while(temp.link!=null){
                System.out.println(temp.data+" ");
                temp=temp.link;
            }
        }
    }
    public void Search(int k){
        if(head==null){
            System.out.println("not found");
            return;
        }
        else{
            Node temp=head;
            while(temp.link!=null){
                if(temp.data==k){
                    System.out.println("item found");
                    return;
                }
                temp=temp.link;
            }
            System.out.println("item not found");
        }
    }
    public void addAtPosition(int d,int pos){
        if(pos<1){
            return;
        }
        Node newnode=new Node(d);
        if(head==null){
            if(pos!=1){
                System.out.println("the list is too small to add at this point");
                return;
            }
            else{
                head=newnode;
                return;
            }
        }
        else if(pos==1){
            newnode.link=head;
            head=newnode;
        }
        else{
            Node temp=head;
            int i=1;
            while(i!=pos-1){
                temp=temp.link;
                i++;
            }
            if(temp!=null){
            newnode.link=temp.link;
            temp.link=newnode;
            return;
            }
            return;
        }
    }
    public void addBeforeKey(int data,int key){
        Node newnode=new Node(data);
        if (head==null){
            System.out.println("list empty");
        }
        if(head.data==key){
            newnode.link=head;
            head=newnode;
        }
        Node temp=head;
        Node BeforeTemp=head;
        while(temp.link!=null){
            if(temp.data==key){
                BeforeTemp.link=newnode;
                newnode.link=temp;
                return;
            }
            BeforeTemp=temp;
            temp=temp.link;
        }
        System.out.println("key value not found");
        
    }

    public void addAfterKey(int data,int key){
        if(head==null){
            System.out.println("list empty");
            return;
        }
        else{
            Node newnode=new Node(data);
            Node temp=head;
            while(temp.link!=null){
                if(temp.data==key){
                    newnode.link=temp.link;
                    temp.link=newnode;
                    return;
                }
                temp=temp.link;
            }
        }
    }
    

    public void removeKey(int data,int key){
        if(head==null){
            System.out.println("nothin here to delete");
            return;
        }
        Node newnode=new Node(data);
        if(head.data==key){
            head=head.link;
            return;
        }
        Node temp=head;
        while(temp.link!=null){
            if(temp.link.data==key){
                temp.link=temp.link.link;
                return;
            }
            temp=temp.link;
        }
        return;
    }
    
    
}

class SinglyLinkedListApp{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SinglyLinkedList SIL=new SinglyLinkedList();
        System.out.println("singly linked list operation");
        while(true){
            System.out.println("1.AddFirst\n2.AddLast\n3.AddATPosition\n4.AddBeforekey\n5.AddAfterKey\n6.Remove Key\n7.Exit\n");
            System.out.println("enter choice");
            int n=sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("enter the element to add");
                    int ele=sc.nextInt();
                    SIL.addFirst(ele);
                case 2:
                    //System.out.println("enter the element ");
                    SIL.display();
            }
        }
    }
}