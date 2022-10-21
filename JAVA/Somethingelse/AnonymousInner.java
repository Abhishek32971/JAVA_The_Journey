abstract class AnonymousOuter {
    public abstract void mymethod();
}
public class AnonymousInner{
    public static void main(String[] args) {
        AnonymousOuter inner= new AnonymousOuter(){
            public void mymethod(){
                System.out.println("this is an example of anonymous inner class");
            }
        };
        inner.mymethod();
    }
}
