import java.lang.*;
import java.io.*;
import java.util.*;

class M {
    void method() throws ArithmeticException, IOException {
        throw new ArithmeticException("device error");
    }

    public static void Validate(int num) {
        if (num > 18) {
            throw new ArithmeticException("number over 18");
        }
    }
}

public class ThrowThrows {
    public static void main(String[] args) {
        M n = new M();

        try {
            n.method();
            n.Validate(110);
        } catch (ArithmeticException e) {
            System.out.println("enter number below 18*");

        }
        catch(IOException e){
            System.out.println(e);
        }
        System.out.println("rest of the code is executed");

    }
}