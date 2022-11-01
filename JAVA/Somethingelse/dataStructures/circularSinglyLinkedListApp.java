package dataStructures;
class circularSinglyLinkedList{
    class Node{
        int data;
        Node link;
        Node(int data){
            data=d;
            link=null;
        }
    }
    Node tail;
    circularSinglyLinkedList{
        tail=null;
    }


    public void addFisrst(int d){
        Node newnode=new Node(d);
        if(tail==null){
            tail=newnode;
            tail.link=tail;
            return;
        }
        else{
            newnode.link=tail.link;
            tail.link=newnode;
        }
    }
    public void addLast(int d){
        Node newnode=new Node(d);
        if(tail==null){
            tail=newnode;
            tail.link=tail;
            return;
        }
        else{
            newnode.link=tail.link;
            tail.link=newnode;
            tail=newnode;
            return;
        }
    }
    public void display(){
        if(tail==null){
            System.out.println("no elements in list");
            return;
        }
        else{
            Node temp=tail.link;
            do{
                System.out.println(temp.data+" ");
                temp=temp.link;
            }while(temp!=tail);
            System.out.println();
            return;
        }
    }
}
public class circularSinglyLinkedListApp {

    
}
