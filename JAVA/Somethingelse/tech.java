import java.lang.*;
abstract class exam2{
    String name;
    double Basic_sal,da,hra,it,ra;
    
    exam2(String a,Double b){
        name=a;
        Basic_sal=b;
        da=b*0.7;
        ra=b*0.3;
        hra=b*0.5;
        it=b*0.4;
        
    }
    abstract double gross_sal();
    

}
class Manager extends exam2{
    double inc;

    Manager(String a,double b){
        super(a,b);
    }
    double gross_sal(){
        inc=Basic_sal*0.1;
        double gross=inc+da+hra-it+ra;
        System.out.println("Manager name = "+name);
        System.out.println("Basic sal  = "+Basic_sal);
        return gross;
    }

}
public class tech extends exam2{
    double inc;
    tech(String a,double b){
        super(a,b);

    }
    double gross_sal(){
        inc=Basic_sal*0.1;
        double gross = inc+da+hra+ra-it;
        System.out.println("Techname = "+name);
        System.out.println("basic sal = "+Basic_sal);
        return gross;
    }
    public static void main(String[] args)
    {
        Manager m=new Manager("suhas", 10000);
        tech t=new tech("subash", 10000000);
        System.out.println(m.gross_sal());
        System.out.println(t.gross_sal());
    }

}