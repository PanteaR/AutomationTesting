package PrincipiileOop;

import java.util.Random;
import java.util.Scanner;

public class GhicesteNumarul {
    //Scrie un joc in care calculatorul alge un numar aleator intre 1 si 20, iar utilizatorul va invecerca sa-l ghiceasca;
    //in cazul in care utilizatorul nu reuseste sa-l ghiceasca, atunci programul ii va oferi un indiciu mai mare sau mai mic.

    public static void main(String[] args) {
        int min = 1;
        int max = 20;
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        int numarRandom = min + (int) (Math.random() * (max - min + 1));
        boolean ghicit = false;
        while (!ghicit) {
            System.out.println("Ghiceste numarul: ");
            int numarTastatura = scanner.nextInt();
            System.out.println("introdu numarul intre : " + min + " si " + max);
            if (numarTastatura == numarRandom) {
                ghicit = false;
                System.out.println("Felicitari ai ghicit numarul");
                break;
            } else if (numarTastatura < numarRandom) {
                System.out.println("Numarul tastat " + numarTastatura + " este mai mic decat numar random");
            } else if (numarTastatura > numarRandom) {
                System.out.println("Numarul tastat " + numarTastatura + " este mai mare decat numar random");
            }
        }
    }
}

