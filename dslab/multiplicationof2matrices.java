import java.util.*;
public class multiplicationof2matrices {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int order;
        System.out.println("matrix multiplication of same order");
        System.out.print("enter the order:");
        order=read.nextInt();
        Matrix A=new Matrix(order);
        Matrix B=new Matrix(order);
        System.out.println("Enter the elements of A");
        A.readMat(read);
        System.out.println("Enter the elements fo B");
        B.readMat(read);
        System.out.println("the matrix a is");
        A.printMat();
        System.out.println("the matrix b is");
        B.printMat();
        Matrix prod=A.matMultipy(B);
        System.out.println("the new matrix obtained through multiplication is");
        prod.printMat();
    }
}
class Matrix{
    int mat[][];
    int row,col;
    Matrix(){
        mat=null;
        row=col=0;
    }
    Matrix(int order){
        mat=new int[order][order];
        row=col=order;
    }
    void readMat(Scanner read){
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.col;j++){
                mat[i][j]=read.nextInt();
            }
        }
    }
    void printMat(){
        for(int r=0;r<this.row;r++){
            int c;
            for (c=0;c<this.col-1;c++){
                System.out.print(this.mat[r][c]+" ");
            }
            System.out.println(this.mat[r][c]);
        }
    }
    Matrix matMultipy(Matrix m)
    {
        Matrix prod=new Matrix(this.row);
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.col;j++){
                prod.mat[i][j]=0;
                for(int k=0;k<this.row;k++){
                    prod.mat[i][j]=prod.mat[i][j]+ this.mat[i][k]*m.mat[k][j];
                }
            }
        }
        return prod;
    }
}
