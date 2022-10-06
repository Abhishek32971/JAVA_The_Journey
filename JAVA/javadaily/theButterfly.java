import java.util.*;
public class theButterfly {
    public static void main(String[] args) {
        for(int i=0,j=9;i!=10 && j!=10;i++,j--){
            String[] a= new String[10];
            a[0]="*";
            a[9]="*";
            a[i]="*";
            a[j]="*";
            for (int k=0;k<10;k++){
                if (a[k]==null){
                    System.out.print(" ");
                }
                else{
                    System.out.print(a[k]);
                }
            }
            System.out.println();
        }
    }
}
