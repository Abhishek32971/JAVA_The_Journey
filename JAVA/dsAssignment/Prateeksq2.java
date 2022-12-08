import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Prateeksq2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter degree of Polynomial 1: ");
        int n = sc.nextInt();
        Polynomial P1 = new Polynomial(n);
        System.out.println(P1.poly);

        System.out.print("Enter degree of Polynomial 2: ");
        int q = sc.nextInt();
        Polynomial P2 = new Polynomial(q);
        System.out.println(P2.poly);

        Polynomial ans = Polynomial.addPolynomial(P1, P2);
        System.out.print("Result: ");
        System.out.println(ans.poly);
        sc.close();
    }
}

class Polynomial {
    int degree;
    LinkedList<Float> poly;

    Polynomial(int deg) {
        poly = new LinkedList<Float>();
        Random rand = new Random();
        degree = deg;
        for (int i = 0; i <= deg; i++)
            poly.add(rand.nextFloat() * 100);
    }

    public void addCoeffcient(int index, float value) {
        poly.set(index, value);
    }

    public static Polynomial addPolynomial(Polynomial Pa, Polynomial Pb) {
        int max = Math.max(Pa.degree, Pb.degree);
        int min = Math.min(Pa.degree, Pb.degree);
        Polynomial result = new Polynomial(max);
        for (int i = 0; i <= min; i++) {
            float ans = Pa.poly.get(i) + Pb.poly.get(i);
            result.addCoeffcient(i, ans);
        }
        if (max > min) {
            for (int i = (min + 1); i <= max; i++) {
                try {
                    result.addCoeffcient(i, Pa.poly.get(i));
                }
                catch(IndexOutOfBoundsException e) {
                    result.addCoeffcient(i, Pb.poly.get(i));
                }
            }
        }
        return result;
    }
}

