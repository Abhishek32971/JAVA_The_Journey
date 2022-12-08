public class multipleTryBlock {
    public static void main(String[] args) {
        try{
            try{
                try{
                    int arr[]={1,2,3,4};
                    System.out.println(arr[10]);                
                }
                catch(ArithmeticException e){
                    System.out.println("Arithmetic exception");
                    System.out.println("try-block1");}
                }
            }
            catch(ArithmeticException e){
                
            }
        }
    }

