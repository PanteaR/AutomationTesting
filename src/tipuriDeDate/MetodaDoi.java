package tipuriDeDate;

import java.util.Scanner;

public class MetodaDoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu primul numar: ");
        int a = scanner.nextInt();
        System.out.println("Introdu al doilea numar: ");
        int b = scanner.nextInt();
        for(int i = a; i <= b; i++) {
            System.out.println("Numaratoare: " + i);
        }
        System.out.println("Introdu un nume: ");
        String nume = scanner.next();
        System.out.println("Ma numesc " + nume);
        for(int i = 0; i < nume.length(); i++) {
            System.out.println("Caracter: " + nume.charAt(i));
        }
        for(char caracter : nume.toCharArray()) {
            System.out.println("Metoda doi " + caracter);
        }
    }
}
