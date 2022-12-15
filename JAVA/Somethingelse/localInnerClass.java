public class localInnerClass {
    int data=30;
    void display(){
        data=20;
        class Local{
            void msg(){
                System.out.println(data);    // local class can access the private data of the outer class 
            }
            //data=20;  cannot change data inside Local inner class
        }
        Local L=new Local();   //cant initiate obj outside the function display()
        L.msg();
        L.msg();
    }
    public static void main(String[] args) {
        localInnerClass obj=new localInnerClass();
        obj.display();
    }
}
