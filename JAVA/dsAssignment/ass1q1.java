import java.util.random;
public class ass1q1{
    public static void main(String[] args) {
        Random ra = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = ra.nextInt(1000, 9999);
        }

        System.out.println("Original numbers: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();

        int totPalNo = 0;
        System.out.println("Palindrome numbers: ");
        for(int i=0; i<n; i++){
            int temp = arr[i];
            int r, sum = 0;
            while(arr[i] > 0){
                r = arr[i]%10;
                sum = (sum*10) + r;
                arr[i] = arr[i]/10;
            }
            if(temp == sum){
                System.out.print(temp + " ");
                totPalNo++;
            }
        }
        if(totPalNo == 0){
            System.out.println("No Palindrome numbers!!");
        }
        sc.close();
    }
}
