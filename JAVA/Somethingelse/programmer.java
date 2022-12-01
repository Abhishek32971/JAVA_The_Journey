
class employee{
     final float salary=4000;
     float rtn()
     {
        this.salary+=100;
        return(this.salary);
     }
}
public class programmer{
    int bonus=10000;
    public static void main(String args[]){
        employee p=new employee();
        System.out.println("programmer salis"+p.rtn());
        System.out.println("bonus of programmer");
    }
}
