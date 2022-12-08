

import java.util.Scanner;

interface Arithmetic{
    int operation(int a,int b);
}

public class LambdaExpression{
    public static void main(String[] args) {
        System.out.println("enter the operands");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        Arithmetic add=(int a,int b)->(a+b);
        System.out.println("Addition="+add.operation(x,y));
        Arithmetic sub=(int a,int b)->(a-b);
        System.out.println("subtraction="+sub.operation(x,y));
        Arithmetic multi=(int a,int b)->(a*b);
        System.out.println("multiplication"+multi.operation(x,y));
        Arithmetic div=(int a,int b)->(a/b);
        System.out.println("division="+div.operation(x,y));

    }
    
}
