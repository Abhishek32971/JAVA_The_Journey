interface Animal{
    void type();
}
public class AnonymousTest {
    public static void main(String[] args) {
        Animal an=new Animal(){
            public void type(){
                System.out.println("Anonymous animal");
            }
        };
        an.type();
    }
}
