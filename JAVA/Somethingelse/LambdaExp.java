

public class LambdaExp {
    interface operatio{
        public int operation(int a,int b);
    }
    public int operate(int x,int y,operatio ap){
        return ap.operation(x,y);
    }
    public static void main(String[] args) {
        int c=3;
        int t=2;
        operatio add=(int a,int b)->a+b;
        operatio sub=(int a,int b)->a-b;
        LambdaExp l=new LambdaExp();
        System.out.println(l.operate(c,t,add));
        System.out.println(l.operate(c,t,sub));
    }

    
}
