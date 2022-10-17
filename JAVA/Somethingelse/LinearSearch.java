package classprogram;
import java.util.*;
public class L1{
    public static int linearSearch(int[]a,int key)
    {
        for(int i=0; i<a.length; i++)
            if(a[i]==key)
                return i;
        return -1;
    }
}
public class LinearSearch 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size= sc.nextInt();
        int[] array= new int[size];
        System.out.println("Enter the array elements : ");
        for(int i=0; i<size; i++)
            array[i]= sc.nextInt();
        System.out.println("Enter the search element : ");
        int key= sc.nextInt();
        int loc= L1.linearSearch(array,key);
        if(loc==1)
            System.out.println(key+" Value not found.");
        else
            System.out.println(key+" Value found at "+loc);
        sc.close();

    }


}


