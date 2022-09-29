import java.util.*;
public class thepyramid {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("enter the number until which you want to print the pyramid");
        int count= read.nextInt();
        for (int i=1;i<=count;i++){
            for(int j=0;j<count-i;j++){
                System.out.print(" ");
            }
            System.out.print(i);
            for(int j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}