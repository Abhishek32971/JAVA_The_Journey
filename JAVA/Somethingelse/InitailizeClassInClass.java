public class InitailizeClassInClass {
    class B{
        void msg(){
            System.out.println("hello");
        }
    }
    public static void main(String[] args) {
        InitailizeClassInClass obj=new InitailizeClassInClass();
        InitailizeClassInClass.B bobj =obj.new B();  // InitializeClassInClass.B bobj= new InitializeClassInClass().new B();
        bobj.msg();
    }
}
