import java.util.Scanner;
public class ankushnumbers {
    public static void main(String[] args) {
        String c[]={"","one","two","three","four","five","six","seven","eight","nine"};
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the start number");
        int a=sc.nextInt();
        System.out.println("enter the exit number");
        int b=sc.nextInt();
        for (int i=a;i<=b;i++){
            System.out.println(  ((i>0 && i<=9) ? c[i] : (b>9?(i%2==0  ?  "Even"  :  "odd"   )  :  "none"  )));
        }
    }
}
/* if (a>0&& a<=9){
            for (int i=a;i<=9 && i<=b;i++){
                System.out.println(c[i]);
            }
        }
        if (b>9){
            for(int i=10;i<=b;i++){
                    System.out.println((i%2==0)?"even":"odd");
                }
            }
        }*/
