import java.util.*;
class Stack{
    int stack[];
    int top;
    int size;
    Stack(int value){
        size=value;
        stack=new int[size];
        top=-1;
    }
    void push(int ele){
        if(top!=size-1){
            stack[++top]=ele;
        }
        else{
            System.out.println("stack overflow");
        }
    }
    int pop(){
        if(top==-1){
            System.out.println("stack underflow");
            return -1;
        }
        return stack[top--];
    }
    void display(){
        for(int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
}
public class program3 {
    public static void main(String[] args) {
        System.out.println("enter the size of stack");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack st=new Stack(n);
        boolean flag=true;
        while(flag){
            System.out.println("Welcome to StackADT using arrays\n 1.push to stack \n 2.pop from stack\n 3.display stack\n 4.exit");
            int a=sc.nextInt();
            switch(a){
                case 1:System.out.println("enter the ele ");
                       int ch=sc.nextInt();
                       st.push(ch);
                       break;
                case 2:System.out.println(st.pop());
                       break;
                case 3:st.display();
                       break;
                case 4:flag=false;
                       break;
                default:System.out.println("invalid choice");
            }
        }
    }
    
}
