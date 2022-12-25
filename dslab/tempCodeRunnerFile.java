public class Stak {
    class Node {
        char data;
        Node next;

        Node(char d) {
            data = d;
            next = null;
        }
    }

    Node Top = null;

    char pop() {
        if (Top != null) {
            char c = Top.data;
            Top = Top.next;
        }
    }
    void push(char ele){
        Node New1=new Node(ele);
        New1.next=Top;
        Top=New1;
    }
    char peek(){
        return(Top.data);
    }
}
