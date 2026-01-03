package tipuriDeDate;

import PrincipiileOop.SingleTonExample;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MetodaCalculator calculator = new MetodaCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu primul numar:");
        double a = scanner.nextDouble();
        System.out.println("Introdu al doile numar: ");
        double b = scanner.nextDouble();
        System.out.println("Introdu tipul operatiei: (+ - * /) ");
        String operatie = scanner.next();
        System.out.println("rezultatul operatiei" + operatie + " a numerelor " + a + "si " + b + " este " + calculator.calculeaza(a, b, operatie));
        System.out.println("rezultatul operatiei" + operatie + " a numerelor " + a + "si " + b + " este " + calculator.compara(a, b, operatie));

    }
}

