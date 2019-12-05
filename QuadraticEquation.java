package QuadraticEquation;

import static java.lang.Math.*;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println(RootsCalc());
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    private double discriminant() {
        return pow(b, 2) - 4 * a * c;
    }

    private int NumberOfRoots() {
        if (discriminant() > 0) {
            return 2;
        } else if (discriminant() == 0) {
            return 1;
        }
        return 0;
    }

    public String RootsCalc() {
        int roots = NumberOfRoots();
        double x1;
        double x2;
        if (roots == 2) {
            x1 = -b + sqrt(discriminant()) / 2 * a;
            x2 = -b - sqrt(discriminant()) / 2 * a;
            return "x1 = " + x1 + " x2 = " + x2;
        } else if (roots == 1) {
            x1 = -b / 2 * a;
            return "x = " + x1;
        }

        return "No roots";
    }
}

