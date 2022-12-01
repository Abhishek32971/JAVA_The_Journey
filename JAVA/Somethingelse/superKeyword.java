class Animal{
    void eat(){
        System.out.println("eating");
    }
}
public class superKeyword extends Animal{
    void eat(){System.out.println("eating break");}
    void bark(){
        System.out.println("barking ");
    }
    void work(){
        super.eat();
        bark();
    }
    public static void main(String[] args) {
        superKeyword obj=new superKeyword();
        obj.work();
    }
}
