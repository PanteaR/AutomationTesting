package tipuriDeDate;

public class MetodaCalculator {
    public double calculeaza(double a, double b, String operatie) {
        if (operatie.equals("+")) {
            return a + b;
        } else if (operatie.equals("-")) {
            return a - b;
        } else if (operatie.equals("*")) {
            return a * b;
        } else if (operatie.equals("/")) {
            return a / b;
        }
        return a;
    }

    public boolean compara(double a, double b, String operatie) {
        if (operatie.equals("<")) {
            return a < b;
        } else if (operatie.equals(">")) {
            return a > b;
        }
        return true;
    }
}
