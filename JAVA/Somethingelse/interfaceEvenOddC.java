public class interfaceEvenOddC {
    public boolean odd(int n){
        if(n%2==0){
            return false;
        }
        return true;
    }
    public boolean even(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    interface checkE{
        boolean checkE(int n);
    }
    interface checkO{
        boolean checkO(int n);
    }
    public static void main(String[] args) {
        int n=2;
        interfaceEvenOddC n1=new interfaceEvenOddC();
        checkE e1=(int j)->n1.even(j);
        System.out.println(e1.checkE(n));
        checkO o1=n1::odd;
        System.out.println(o1.checkO(n));
    }
}
