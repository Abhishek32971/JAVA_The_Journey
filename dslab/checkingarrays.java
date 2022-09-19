import java.util.*;

public class checkingarrays {
    public static void main(String args[]){
        int n;  
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store: ");  

        n=sc.nextInt();  
        
        int[] array = new int[10];  
        System.out.println("Enter the elements of the array: ");  
        
        for(int i=0; i<n; i++)  
        {
        array[i]=sc.nextInt();
        } 
        
        int count=0;
        for(int i=0; i<n; i++){
            if (array[i]%2==0){
                count+=1;
            }
        }
        System.out.println("the number of odd numbers are:"+ " " + (count-n));
    }
    
}
