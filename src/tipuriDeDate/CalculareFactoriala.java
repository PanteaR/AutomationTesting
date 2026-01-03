package tipuriDeDate;

import java.util.Scanner;

public class CalculareFactoriala {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu numarul pentru care se doreste factorial: ");
        int numar = scanner.nextInt();
        int rezultatCalcul = calculeazaFactorial(numar);
        System.out.println("Rezultatul calculului factorial al numarului " + numar + " este " + rezultatCalcul);
    }
    private static int calculeazaFactorial(int numar){
        int rezultat = 1;
        if(numar == 1 || numar == 0){
            return rezultat;
        }
        int contor = numar;
        while(contor > 1) {
            // rezultat = rezultat * contor;
            rezultat *= contor;
            contor--;
        }
        return rezultat;
    }
}
