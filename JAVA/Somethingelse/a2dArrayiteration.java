import java.util.*;
public class a2dArrayiteration {
    public static void main(String[] args){
		int[][] arr;
		int row,cloumn;
		row=2;
		cloumn=2;
		Scanner scan=new Scanner(System.in);
		arr=new int[row][cloumn];
		System.out.println("Enter Elements to an array :");
		
		for(int i=0;i<row;i++){
			for(int j=0;j<cloumn;j++){
				arr[i][j]=scan.nextInt();
			}
		}

		for(int i=0;i<row;i++){
			for(int j=0;j<cloumn;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		for(int[] i:arr){
			for(int j:i){
				System.out.print(j+" ");
			}
			System.out.println();
		}

		scan.close();
	}
}
