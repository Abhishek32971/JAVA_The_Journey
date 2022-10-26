import mypack.*;
class package2{
    public static void main(String[] args) {
        mypack.package1 d= new mypack.package1();
        mypack.package1.main(args);
        d.display();
    }
}
