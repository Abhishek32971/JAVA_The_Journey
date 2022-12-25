import java.util.Scanner;

public class program2 {
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
    void FindVal(int arr[][],int value){
        for(int i=0;i<arr[2].length;i++){
            if(arr[2][i]==value){
                System.out.println("the value has been found at row "+arr[0][i]+" and coumn "+ arr[1][i]);
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the new Matrix");
        program2 P=new program2();
        System.out.println("enter the numbers of rows followed by coloums count");
        int r=Sc.nextInt();
        int c=Sc.nextInt();
        int[][] arr=new int[r][c];
        P.MatRead(arr);
        P.MatPrint(arr);
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]!=0){
                    count+=1;
                }
            }
        }
        int[][] Sparse=new int[3][count];
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]!=0){
                    Sparse[0][temp]=i;
                    Sparse[1][temp]=j;
                    Sparse[2][temp]=arr[i][j];
                    temp++;
                }
            }
        }
        P.MatPrint(Sparse);
        System.out.println("enter the value you want to find");
        int value=Sc.nextInt();
        P.FindVal(Sparse, value);
    }
}
