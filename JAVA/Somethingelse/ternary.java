import java.lang.Math;
public class ternary {
    public static void main(String[] args) {
        
        long start = System.nanoTime(); 
        {
        int a=20;
        int b=40;
        int c=50;
        System.out.println((a<b)?(c<b?b:c):a);
        /*if (a<b&& b>c){
            System.out.println(b);
        }
        else if(b<c){
            System.out.println(c);
        }
        else{
            System.out.println(a);
        }*/
        }
        double elapsedTimeInSec = (System.nanoTime() - start);
        System.out.println(Math.round(elapsedTimeInSec)+" "+"nanoseconds");

        long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        {
            int a=20;
            int b=40;
            int c=50;
            System.out.println((a<b)?(c<b?b:c):a);
            /*if (a<b&& b>c){
                System.out.println(b);
            }
            else if(b<c){
                System.out.println(c);
            }
            else{
                System.out.println(a);
            }*/
        }
        long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        long actualMemUsed=afterUsedMem-beforeUsedMem;
        System.out.println(actualMemUsed);

        
        
    }
    
}
