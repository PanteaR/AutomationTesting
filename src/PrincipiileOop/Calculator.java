package PrincipiileOop;

public class Calculator implements Operatii {

    @Override
    public int adunare(int a, int b) {
        return a+b;
    }

    @Override
    public double inmultire(double a, double b) {
        return a*b;
    }

    @Override
    public double impartire(double a, double b) {
        return a/b;
    }

    @Override
    public int scadere(int a, int b) {
        return a-b;
    }

    public static class adunare extends Calculator {
    }
}
