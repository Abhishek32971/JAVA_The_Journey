public class localInnerClass {
    private int data=30;
    void display(){
        class Local{
            void msg(){
                System.out.println(data);    // local class can access the private data of the outer class 
            }
        }
        Local L=new Local();   //cant initiate obj outside the function display()
        L.msg();
    }
    public static void main(String[] args) {
        localInnerClass obj=new localInnerClass();
        obj.display();
    }
}
