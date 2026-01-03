package PrincipiileOop;

public class Rezultat {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        Calculator calculator = new Calculator();
        System.out.println("Rezultatul adunarii " + a + " si " + b + " este egal cu " + calculator.adunare(a, b));
        System.out.println("Rezultatul scaderii " + a + " si " + b + " este egal cu " + calculator.scadere(a, b));
        System.out.println("Rezultatul inmultirii " + a + " si " + b + " este egal cu " + calculator.inmultire(a, b));
        System.out.println("Rezultatul impartirii " + a + " si " + b + " este egal cu " + calculator.impartire(a, b));

    }
}
