package QuadraticEquation;

import static java.lang.Math.*;

class Solve {
    public static void main (String [] args) {
        QuadraticEquation.EquationValues equationValues = new QuadraticEquation.EquationValues(1, 4, 1);

        QuadraticEquation.DiscriminantCheck discriminantCheck = new QuadraticEquation.DiscriminantCheck(equationValues);

        QuadraticEquation.Calculation calculation = new QuadraticEquation.Calculation(equationValues, discriminantCheck.RootValue(), discriminantCheck.DiscriminantValue());

        calculation.rootsResult();
    }
}

class EquationValues {
    public double a;
    public double b;
    public double c;

    public EquationValues(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

class DiscriminantCheck {
    public double discriminant;
    private QuadraticEquation.EquationValues equationValues;

    public DiscriminantCheck(QuadraticEquation.EquationValues equationValues) {
        this.equationValues = equationValues;
    }

    public double getDiscriminant() {
        discriminant = pow(equationValues.b, 2) - 4 * equationValues.a * equationValues.c;
        return discriminant;
    }

    public int NumberOfRoots(){
        if (getDiscriminant() > 0) {
            return 2;
        } else if (getDiscriminant() == 0) {
            return 1;
        }
        return 0;
    }

    public int RootValue() {
        int roots = NumberOfRoots();
        return roots;

    }
    public double DiscriminantValue() {
        double value = getDiscriminant();
        return value;
    }
}

class Calculation {
    private QuadraticEquation.EquationValues equationValues;
    private double rootNumber;
    private double valueDiscriminant;

    public Calculation(QuadraticEquation.EquationValues equationValues, int rootNumber, double valueDiscriminant) {
        this.equationValues = equationValues;
        this.rootNumber = rootNumber;
        this.valueDiscriminant = valueDiscriminant;
    }

    public String RootsCalculation() {
        double roots = rootNumber;
        double x1;
        double x2;
        if (roots == 2) {
            x1 = -equationValues.b + sqrt(valueDiscriminant) / 2 * equationValues.a;
            x2 = -equationValues.b - sqrt(valueDiscriminant) / 2 * equationValues.a;
            return "x1 = " + x1 + " x2 = " + x2;
        } else if (roots == 1) {
            x1 = -equationValues.b / 2 * equationValues.a;
            return "x = " + x1;
        }
        return "No roots";
    }
    public void rootsResult() {
        String rootValues = RootsCalculation();
        System.out.println(rootValues);
    }
}
