public class InfixToPostfix {
    static char[] A=new char[50];
    int top=-1;
    public static int prec(char c){
        switch(c){
            case '+':
            case '-':
                return 1;
            case '%':
            case '/':
            case '*':
                return 2;
            case '^':
            case '$':
                return 3;

        }
        return -1;
    } 

    static void push(char c){
        if (top==A.length-1){
            System.out.println("overflow");
        }
        else{
            A[++top]=c;
        }
    }
    static char pull(){
        if(top==-1){
            System.out.println("underflow");
            return null;
        }
        else{
            return(A[top--]);
        }
        
    }
    static char peek(){
        if(top==-1){
            System.out.println("underflow");
        }
        else{
            return A[top];
        }
    }
    
}
