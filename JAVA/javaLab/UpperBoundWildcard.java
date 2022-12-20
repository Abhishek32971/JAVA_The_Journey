import java.util.*;
public class UpperBoundWildcard{
    public static Double add(ArrayList<? extends Number>num){
        double den=2.0;
        double sum=0;
        for(Number n:num){
            if(n.doubleValue()%den!=0){
                sum+=n.doubleValue();
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<Integer>();
        l1.add(30);
        l1.add(21);
        l1.add(21);
        System.out.println(add(l1));

    }
}