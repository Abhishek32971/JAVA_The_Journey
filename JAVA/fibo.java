import java.util.*;

public class fibo {
    static int myinput(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of items in fibo you want to see");
        int n=sc.nextInt();
        return n;
    }
    static int[] fiboarray(int n){
        int[] a= new int[n];
        a[0]=0;
        a[1]=1;
        for (int i=2;i<n;i++){
            int b=a[i-2];
            int c=a[i-1];
            a[i]=b+c;
        }
        return a;
    }
    static void display(int n,int[] fibo){
        for (int i=0;i<n-1;i++){
            System.out.print(fibo[i]+",");
        }
        System.out.println(fibo[n-1]);
    }
    public static void main(String[] args) {
        int  n=myinput();
        int[] fibo=fiboarray(n);
        display(n,fibo);

        
        
    }
    
}
