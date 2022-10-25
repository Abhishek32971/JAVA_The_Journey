import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> al= new ArrayList<String>();
        System.out.println("the size of arraylist as of now:"+al.size());
        for(int i=0;i<5;i++){
            System.out.println("enter the element to add");
            al.add(sc.next());
            System.out.println("the arraylist now:"+al);
            System.out.println("the lenght of the array list"+al.size());
        }
}
}