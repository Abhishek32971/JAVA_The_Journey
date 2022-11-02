
import java.util.*;
public class countPrime {
    public static boolean checkPrime(int num){
        for (int i=2;i<num/2;i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int count=0;
        for (int i=0;i<n;i++){
            if((arr1[i]>1) && (checkPrime(arr1[i]))){
                count++;
            }
        }
        System.out.println("the count of the primes is "+ count);
    }
}
