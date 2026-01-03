package tipuriDeDate;

import java.util.Scanner;

public class CitireDeLaTastatura {
    public static void main(String[] args) {
        /* O metoda ce printeaza numerele crescator de la un numar citit de la tastatura pana la cel de-al doilea numar citit de la tastatura; */
        Scanner numere = new Scanner(System.in);
        System.out.println("Introdu primul numar: ");
        int x = numere.nextInt();
        System.out.println("Introdu al doilea numar: ");
        int y = numere.nextInt();
        for (int i = x; i <= y; i++) {
            System.out.println("Numaratoare crescatoare: " + i);
        }
        /*O metoda ce printeaza numerele descrescator de la un numar citit de la tastatura pana la cel de-al doilea numar citit de la tastatura; */
        for (int i = x; i >= y; i--) {
            System.out.println("Numere descrescatoare: " + i);
        }
        /* O metoda ce itereaza printr-un sir de caractere, string introdus de la tastatura;*/
        Scanner litere = new Scanner(System.in);
        System.out.println("Numele meu: ");
        String numeleMeu = litere.next();
        for (int i = 0; i < numeleMeu.length(); i++) {
            System.out.println("Caracter: " + numeleMeu.charAt(i));
        }
        /* O metoda cu doua bucle for, una din ele itereaza printr-un array unidemnsional si adauga elemente de la 0 la 10; a doua bucla for ce printeaza elementele din array.*/
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + 1);
        }
        //Iterati si adaugati elemente intr-un array multidimentional.
        int[][] myNumbers = {{1, 2}, {5, 6}};
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
