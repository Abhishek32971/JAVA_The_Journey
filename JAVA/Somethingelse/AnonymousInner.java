abstract class AnonymousOuter {
    public abstract void mymethod(){};
}// the above class and method need not be abstract
public class AnonymousInner{
    public static void main(String[] args) {
        AnonymousOuter inner= new AnonymousOuter(){
            public void mymethod(){
                System.out.println("this is an example of anonymous inner class");
            }
        };
        inner.mymethod();
        Ageu A=new Ageu(){
            public void mymet(){
                System.out.println("this is an example of anonymous inner class through interface");
            }
        };
        A.mymet();
    }
}
interface Age 
{ 
    int x = 21; 
    void getAge(); 
} 
class Ageu implements Age{
    public void mymet(){};// cannot comment this line and expect to get output
    public void getAge()  
    { 
        // printing the age 
        System.out.print("Age is "+x); 
    

}}