
import java.util.*;
class Stak {
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
        char c=Top.data;
        if (Top != null) {
            //char c = Top.data;
            Top = Top.next;
            //return c;
        }
        return c;
        
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

public class ParenthesisBalance {
    public static void main(String[] args) {
        Stak S=new Stak();
        String Str="{}{}";
        boolean D=true;
        for (int i = 0; i < Str.length(); i++) {
            char ch=Str.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                S.push(ch);
            }
            else{
                //boolean D=true;
                switch(ch){
                    case ')':if(S.peek()=='{'||S.peek()=='['){
                        //System.out.println("not balanced");
                        //Exit();
                        D=false;
                    }
                    else{S.pop();}
                    break;
                    case '}':if(S.peek()=='('||S.peek()=='['){
                        //System.out.println("not balanced");
                        D=false;
                    }
                    else{S.pop();}
                    break;
                    case ']':if(S.peek()=='{'||S.peek()=='('){
                        //System.out.println("not balanced");
                        D=false;
                    }
                    else{S.pop();}
                    break;
                    default:break;
                }
            }
            
        }
        if(S.Top==null && D==true){
            System.out.println("yes it is balanced");
        }
        else{
            System.out.println("no");
        }
    }

}
