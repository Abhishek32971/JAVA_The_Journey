import java.util.*;
public class count {
    public static void main(String args[]){
        int count=0;
        Scanner b=new Scanner(System.in);
        System.out.println("enter the number till which you want to count");
        int z=b.nextInt();
        for (int i=1;i<z+1;i++){
            if (i%2==0) {
                count+=1;
            }
            
        }
        System.out.println(count);
    }
    
}