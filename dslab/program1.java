import java.util.*;
public class program1 {
    Scanner sc=new Scanner(System.in);
    void MatRead(int arr[][]){
        System.out.println("enter the values of matrix");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void MatPrint(int arr[][]){
        System.out.println("the new matrix is as follows");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    int[][] Multiply(int arr1[][],int arr2[][],int m,int n,int p,int q){
        int[][] finalMat=new int[m][q];
        if(n!=p){
            System.out.println("the order of the matrices is not the same");
            System.exit(0);
        }
            for(int i=0;i<m;i++){
                for(int j=0;j<q;j++){
                    int sum=0;
                    for(int k=0;k<p;k++){
                        sum+=arr1[i][k]*arr2[k][j];
                    }
                    finalMat[i][j]=sum;
                }
            }
            return finalMat;
        
        
    }
    public static void main(String[] args) {
        program1 P= new program1();
        System.out.println("enter order");
        Scanner Sc=new Scanner(System.in);
        int order=Sc.nextInt();
        int[][] Mat1= new int[order][order];
        int[][] Mat2=new int[order][order];
        P.MatRead(Mat1);
        P.MatRead(Mat2);
        int[][] resultMat=P.Multiply(Mat1, Mat2, order, order, order, order);
        P.MatPrint(resultMat);
    }
}
