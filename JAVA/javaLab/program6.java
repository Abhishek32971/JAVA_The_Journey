import java.util.*;
public class program6 {
    public static void main(String[] args) {
        String[] countries = { "a", "b", "f", "z", "x", "t" };
        int size = countries.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < countries.length; j++) {
                if (countries[i].compareToIgnoreCase(countries[j])>0) {
                    String temp = countries[i];
                    countries[i] = countries[j];
                    countries[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(countries));
    }
}