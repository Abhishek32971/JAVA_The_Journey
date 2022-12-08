import java.util.Random;
import java.util.*;

public class ass1q1 {
    public static void fillarr(int[] arr,int n) {
        Random ra = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = ra.nextInt(1000, 9999);
        }

        System.out.println("Original numbers: ");
        for (int i = 0; i < n-1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr[n-1]);

    }
    public static boolean isPalindrm(int i){
        String s=Integer.toString(i);
        String reverse="";
        for (int j=s.length()-1;j>=0;j--){
            reverse= reverse + s.charAt(j);
        }
        int s1=Integer.valueOf(s);
        int rev1=Integer.valueOf(reverse);
        if(s1==rev1){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        fillarr(arr,n);


        int totPalNo = 0;
        System.out.println("Palindrome numbers: ");
        for(int i=0; i<n; i++){
            if(isPalindrm(arr[i])){
                System.out.print(arr[i] + " ");
                totPalNo++;
            }
        }
        if(totPalNo == 0){
            System.out.println("No Palindrome numbers!!");
        }
    }
}
