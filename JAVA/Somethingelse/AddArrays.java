import java.util.*;
public class AddArrays {
    public static Scanner sc= new Scanner(System.in);
    public static void display(int[][] arr,int r1,int c1){
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("enter first matrix");
        System.out.println("enter the no of rows");
        int r1=sc.nextInt();
        System.out.println("enter the no of colomns");
        int c1=sc.nextInt();
        int[][] mat1= new int[r1][c1];
        for (int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter second matrix");
        System.out.println("enter the no of rows");
        int r2=sc.nextInt();
        System.out.println("enter the no of colomns");
        int c2=sc.nextInt();
        int[][] mat2= new int[r2][c2];
        for (int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        int[][] multiMat= new int[r1][c1];
        if(r1==r2 && c1==c2){
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    multiMat[i][j]=mat1[i][j]+mat2[i][j];
                }
            }
            display(multiMat,r1,c1);
        }
        else{
            System.out.println("these two matrices cant be multiplied");
        }
    }
}
