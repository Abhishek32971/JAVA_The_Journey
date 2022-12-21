import java.util.*;
import java.lang.*;
public class testOfExam<T extends Number> {
    public static<T extends Number> int add(T x,T y){
        int Sum=(int)(x.intValue()+y.intValue());

        return Sum;
    } 
       
    public static void main(String[] args) {
        testOfExam<Integer> J= new testOfExam<Integer>();
        System.out.println(J.add(2.3,3));
        /*Map< String,Integer> hm =  new HashMap< String,Integer>(); 
       hm.put("a", new Integer(100)); 
       hm.put("b", new Integer(200)); 
       hm.put("c", new Integer(300)); 
       hm.put("d", new Integer(400));
       System.out.println(hm);
        */
    }
}
