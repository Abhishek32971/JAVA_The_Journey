import java.util.*;
public class AllAboutArrays {
    public static void main(String[] args) {
        int[][] arr1={ {10, 20, 30}, {15, 25, 35}, {22, 44, 66}, {33, 55, 77} };
        int[][] arr2= new int[1][2];
        int[][] arr3= new int[1][];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.println(arr1[i][j]);
            }
        }
        int[] arr4={1,2,3};
        System.out.println(Arrays.toString(arr4));
    }
}
