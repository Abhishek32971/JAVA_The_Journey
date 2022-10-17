public class Employee {
    private static int lastid=0;
    private int id;
    public Employee()
    {
        lastid++;
        id=lastid;
    }
    public static void main(String[] args) {
        Employee r=new Employee();
        System.out.println(r.id+" "+r.lastid);
    }
}
