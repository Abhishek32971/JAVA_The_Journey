class coordinate{
    int a,b;
    public coordinate(){
        a=50;
        b=100;
    }
    public coordinate(int p,int q){
        a=p;
        b=q;
    }
    public void displayy(){
        System.out.println(a+" "+b);
    }
}
class constructor1{
    public static void main(String[] args)
    {
        coordinate co1=new coordinate(12,34);
        co1.displayy();
        coordinate co2=new coordinate();
        co2.displayy();
    }
}
