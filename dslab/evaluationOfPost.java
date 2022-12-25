import java.util.Scanner;

public class evaluationOfPost {
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
	
	static int posteval(String exp) {
		
		for(int i=0;i<exp.length();i++) {
			char c=exp.charAt(i);
			if(c==' '){
                continue;
            }
			if(Character.isDigit(c)) {
				push(Character.getNumericValue(c));
			}
			else {
				 int opnd2 = pop();
                 /*if(opnd2==' '){
                    opnd2=pop();
                 } */
       			 int opnd1 = pop();   
                 /*if(opnd1==' '){
                    opnd1=pop();
                 }*/
        		switch(c) 
        		{ 
            		case '+':	push(opnd1+opnd2); break; 
            		case '-': 	push(opnd1-opnd2); break; 
            		case '/': 	push(opnd1/opnd2); break; 
            		case '*': 	push(opnd1*opnd2); break; 
            		default:    System.out.println("\n\tInvalid Operator.");
                        	System.exit(0);
        		}
        	}
            //System.out.println(Stack[top]);
		}
		
	return Stack[top];		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the postfix expression");
		String in="6 3 2 - 5 * +";
		System.out.println("The postfix expression is"+in);
		
		int result=posteval(in);
		System.out.println("The result is"+result);

	}

}
