public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        double n=sc.nextDouble();
        double epsilon=1e-15; 
        double x=n; 
        while(Math.abs(x-a/x)>=epsilon*x){
            x=(x+(a/x))/2.0;
        }
    }
}
