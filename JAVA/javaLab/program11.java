import java.util.Arrays;
import java.lang.*;

class GenricBul<T extends Comparable<? super T>>{
    T[] array;
    GenricBul(T[] array){
        this.array=array;
    }
    public T[] bulsort(){
        for(int i=array.length;i<1;i--){
            for(int j=0;j<i-1;j++){
                if(array[j].compareTo(array[j+1])>0){
                    swapnum(j,array);
                }
            }
        }
        return array;
    }
    void swapnum(int index,T[] array){
        T temp=array[index];
        array[index]=array[index+1];
        array[index+1]=temp;
    }

}


public class program11 {
    public static void main(String[] args) {
        Integer[] i={1,2,3,3,4,2,1,0};
        
        BubbleSortGeneric<Integer> B=new BubbleSortGeneric<Integer>(i);
        Integer[] i2=B.bulsort();
        System.out.println("here is array"+Arrays.toString(i2));
    }
    
}
