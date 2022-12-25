import java.util.*;
public class program5 {
    static char[] stack=new char[100];
    static int top=-1;
    static int size=10;
    static void push(char ele){
        if(top!=size-1){
            stack[++top]=ele;
        }
        else{
            System.out.println("stack overflow");
        } 
    }
    static int Prec(char c){
        switch(c){
            case '+':
            case '-':
            return 1;
            case '/':
            case '*':
            case '%':
            return 2;
            case '$':
            case '^':
            return 3;
            //default : return 4;
        }
        return -1;
    }
    static char pop(){
        if(top==-1){
            System.out.println("stack underflow");
            return 'n';
        }
        return stack[top--];
    }
    static String postfixConverter(String str){
        String result="";
        push('#');
        for(int i=0;i<str.length();i++){
            char C=str.charAt(i);
            if(C==' '){
                continue;
            }
            if(Character.isLetterOrDigit(C)){
                result+=(C+" ");
            }
            else if(C=='('){
                push(C);
            }
            else if(C==')'){
                while(stack[top]!='('){
                    result+=pop();
                }
                pop();
            }
            else{
                while(Prec(C)<=Prec(stack[top])  && stack[top]!='#'){
                    result+=(pop()+" ");
                }
                push(C);
            }

        }
        while(stack[top]!='#'){
            result+=(pop());
            result+=' ';
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String st=sc.nextLine();
        size=st.length();
        String RE=postfixConverter(st);
        System.out.println(RE);
    }
}
