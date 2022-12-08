import java.util.Scanner;
public class GaussJordan {
    public static int n;
    public static void ConvertToD(float[][] a,int n){
        float ratio;
        for (int i = 0; i <n; i++) {
            for(int j=0;j<n;j++){
                if(j!=i){
                ratio=a[j][i]/a[i][i];
                for(int k=0;k<n+1;k++){
                    a[j][k]=a[j][k]-ratio*a[i][k];
                }
            }
            System.out.println("intermediate forms");
            for(int x=0;x<n;x++){
                for(int y=0;y<n+1;y++){
                    System.out.printf("%f",a[x][y]);
                }
                System.out.println();
            }
            System.out.println();
            }
        }
            
    }
    public static void PrintUnknow(float[][] a,int n){
        for(int i=0;i<n;i++){
            System.out.printf("the value of variable %d=%f",i,a[i][n]/a[i][i]);
        }
    }
    public static void main(String[] args) {
        float ratio;
        System.out.println("enter the unknowns");
        n=sc.nextInt();
        float[][] a=new float[n][n+1];
        System.out.println("enter the augmented matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n+1;j++){
                a[i][j]=sc.nextFloat();
            }
        }
        ConvertToD(a, n);
        PrintUnknow(a, n);


    }
    public final static Scanner sc=new Scanner(System.in);

} 

