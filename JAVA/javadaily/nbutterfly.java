import java.util.*;

public class nbutterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the butterfly half width of the butterfly");
        int n = sc.nextInt();
        n = n * 2;
        for (int i = 0, j = n - 1; i != n && j != n; i++, j--) {
            String[] a = new String[n + 1];
            a[0] = "*";
            a[n - 1] = "*";
            a[i] = "*";
            a[j] = "*";
            for (int k = 0; k < n; k++) {
                if (a[k] == null) {
                    System.out.print(" ");
                } else {
                    System.out.print(a[k]);
                }
            }
            System.out.println();
        }
    }
}
