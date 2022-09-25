import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.time.StopWatch;
public class ternary {
    public static void main(String[] args) {
        long start1 = System.nanoTime();
        int a=20;
        int b=40;
        int c=50;
        System.out.print((a<b)?(c<b?b:c):a);
        long end1 = System.nanoTime();
        System.out.println("Elapsed Time in nano seconds: "+ (end1-start1));
    }
    
}
