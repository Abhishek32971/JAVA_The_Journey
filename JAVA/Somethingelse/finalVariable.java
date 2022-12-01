public class finalVariable {
    final int MAX;
    finalVariable(){
        MAX=100;
    }
    void Mymethod(){
        System.out.println(MAX);
    }
    public static void main(String[] args) {
        finalVariable obj=new finalVariable();
        obj.Mymethod();//out put -100
    }
}
