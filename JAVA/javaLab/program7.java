abstract class Empl {
    String name;
    double basic_sal;
    double da;
    double hra;
    double it;

    Empl(String d, double b) {
        name = d;
        basic_sal = b;
        da = basic_sal * 0.7;
        hra = basic_sal * 0.3;
        it = basic_sal * 0.4;

    }
    abstract double gross_sal();
}

public class program7 {

}
