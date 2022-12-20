import java.lang.Exception;
import java.util.*;
class OddException extends Exception{
    OddException(){
        super("odd number exception");
    }
    OddException(String msg){
        super(msg);
    }
}
class EvenOdd{
    void halfOf(int num){
        try{
            if(num%2!=0){
                throw(new OddException());
            }
            if(num==0){
                throw(new OddException());
            }
            else{
                System.out.println("it is an even number half is"+" "+num/2);
            }
        }
        catch(OddException EX){
            System.out.println("error"+EX.getMessage());

        }
    }
}
public class program8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        EvenOdd op=new EvenOdd();
        op.halfOf(num);
    }
}