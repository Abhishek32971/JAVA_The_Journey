public class InnerClass {
    private int a=20;
    protected int b=20;
    int c=20;
// it can access everything 
    class Inner{
        void printu(){
        System.out.println(a+" "+b+" "+c);
    }}
    public static void main(String[] args){
        InnerClass I= new InnerClass();
        InnerClass.Inner i= I.new Inner();
        i.printu();
    }
}
