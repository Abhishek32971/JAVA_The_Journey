import java.util.*;
public class program7 {
    static int Stack[]=new int[50];
	static int top=-1;
	
	static void push(int ele) {
		Stack[++top]=ele;
	}
	static int pop() {
		if(top==-1) {
			System.out.println("Underflow");
			return -1;
		}
		else {
			return(Stack[top--]);
		}
	}
    static int PostfixEval(String str){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                push(Character.getNumericValue(ch));
            }
            else{
                int op2=pop();
                int op1=pop();
                switch(ch){
                    case '+':push(op1+op2);
                    case '-':push(op1-op2);
                    case '*':push(op1*op2);
                    case '/':push(op1/op2);
                }
            }
        }
        return stack[top];
    }
    public static void main(String[] args) {

    }
}
