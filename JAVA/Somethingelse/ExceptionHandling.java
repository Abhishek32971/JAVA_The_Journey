import java.util.Scanner;

public class ExceptionHandling {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // arithmatic exception
        try{
            System.out.println("Arithmatic exception");
            int a=50/0;
            System.out.println(a);
        }
        catch(ArithmeticException e){
            System.out.println("you cant divide by 0\n enter a different value to divide 50 ");
            int b=sc.nextInt();
            System.out.println(50/b);
            System.out.println("rest of code");
        }
        try{
            System.out.println("array index out of bounds exception");
            int[] a=new int[5];
            a[10]=20;
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{    
            int a[]=new int[5];    
            a[5]=30/0;    
           }    
           catch(Exception e){System.out.println("common task completed");}    
           catch(ArithmeticException e){System.out.println("task1 is completed");}    
           catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}    
           System.out.println("rest of the code...");    
         }    
        
    }


