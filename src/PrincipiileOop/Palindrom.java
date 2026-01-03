package PrincipiileOop;

import java.util.Scanner;

public class Palindrom {
    //sa se citeasca un text de la tastatura si sa se verifice daca acesta este palindrom.
    //Sa se afiseze TRUE, else FALSE

    //Pasul 1. Citim string-ul de la tastatura
    //Pasul 2. Verificare daca este null/sau are o singura litera;
    //Pasul 3. Verificam daca este palindrom.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" introdu string de verificat: ");
        String propozitie = scanner.nextLine();
        System.out.println("propozitia de verificat este: " + propozitie);
        String inversata = "";
        if (propozitie != null && propozitie.length() > 1) {

            boolean estePalindrom = new StringBuilder(propozitie).reverse().toString().equals(propozitie);
            System.out.println("Propozitia este palindrom? " + estePalindrom);

            for (int i = propozitie.length()-1; i >= 0; i--){
                inversata += propozitie.charAt(i);
            }
            System.out.println("v2: Propozitia este palindrom? " + inversata.equals(propozitie));
        }


    }

}
