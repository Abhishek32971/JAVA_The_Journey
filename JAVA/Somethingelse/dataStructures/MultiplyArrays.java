package dataStructures;
import java.util.*;

public class MultiplyArrays {
    public static Scanner sc= new Scanner(System.in);
    public static void display(int[][] arr,int r1,int c1){
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static int[][] inputArr(int row,int col){
        int[][] mat1= new int[row][col];
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        return mat1;
    }
    public static void MatMultiply(int[][] mat1,int[][] mat2,int r1,int r2,int c1,int c2){
        if(c1==r2){
            int[][] multiMat=new int[r1][c2];
            for (int i = 0; i <r1; i++) {
                for(int j=0;j<c2;j++){
                    int sum=0;
                    for(int k=0;k<r2;k++){
                    sum=sum+mat1[i][k]*mat2[k][j];
                    }
                    multiMat[i][j]=sum;
                }
                
            }
            display(multiMat, r1, c2);
        }
        else{
            System.out.println("the mat cant be multiplied");
            exit();
        }
        
    }
    public static void main(String[] args) {
        System.out.println("enter first matrix");
        System.out.println("enter the no of rows");
        int r1=sc.nextInt();
        System.out.println("enter the no of colomns");
        int c1=sc.nextInt();
        int[][] mat1=inputArr(r1, c1);
        System.out.println("enter second matrix");
        System.out.println("enter the no of rows");
        int r2=sc.nextInt();
        System.out.println("enter the no of colomns");
        int c2=sc.nextInt();
        int[][] mat2=inputArr(r2, c2);
        MatMultiply(mat1, mat2, r1, r2, c1, c2);
    }
}
