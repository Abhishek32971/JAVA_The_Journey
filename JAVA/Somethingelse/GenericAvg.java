import java.util.*;
import java.lang.*;
public class GenericAvg<T extends Number> {
    T[] num;
    GenericAvg(T[] num){
        this.num=num;
    }

    double FindAvg(){
        double sum=0;
        for(int i=0;i<num.length;i++){
            sum+=num[i].doubleValue();
        }
        return sum/num.length;
    }

    public static void main(String[] args) {
        Integer i[]={1,2,3,4,5};
        GenericAvg<Integer> init=new GenericAvg<Integer>(i);
        double d=init.FindAvg();
        System.out.println(d);
        Integer Max=init.maximum(1, 2, 3);
        System.out.println(Max);
        List<Integer> lst=Arrays.asList(1,2,3,4);
        Double sum=init.sum(lst);
        System.out.println(sum);
    }
    public static Double sum(List<? extends Number> list){
        Double Sum=0.0;
        for(Number i:list){
            Sum+=i.doubleValue();
        }
        return Sum;
    }
    public<T extends Comparable<T>> T maximum(T x,T y,T z){
        T max=x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        return max;
    }
    
}
