package ramonaTutorial;

import java.util.Scanner;

public class Exercitii {
    public static void main(String[] args) {
        //Scrieti un program care afiseaza “Imi place Java”
        System.out.println("Imi place Java!");

        //Scrieti un program care afiseaza de 6 ori propozitia “Cursul acesta este foarte fain!”

     for (int i = 0; i < 6; i++) {
         System.out.println("Cursul acesta este foarte fain!");

     }
       /*Ana are 24 de ani. Fratele ei, David, e cu 6 ani mai mic. Scrieti un program care afiseaza varsta lui David.*/
        int Ana = 24;
        int David = 24-6;
        System.out.println(David);


        //Scrieti un program in care cititi o propozitie de la tastatura
        Scanner tastatura = new Scanner(System.in);
        System.out.println("Aceasta propozitie este scrisa de la tastatura: ");
        String propozitieIntrodusa ="Am introdus propozitia: " + tastatura.nextLine();
        System.out.println(propozitieIntrodusa);

        System.out.println(myVariables1(1));
        System.out.println(myVariables2("Ramona"));
        System.out.println(myVariables3(true));

        System.out.println(modul(7,2));

    }
    //Scrieti un program in care definiti 3 variabile in metoda “myVariables”, un int, un
    //String si un boolean, apoi apelati metoda din metoda “main”

    private static int myVariables1(int numar1) {
        int rezultat = numar1;
        return rezultat;
    }

    public static String myVariables2(String nume1){
        String rezultat = nume1;
        return rezultat;
    }
    public static boolean myVariables3(boolean tip1){
        boolean rezultat = tip1;
        return rezultat;
    }
    public static int modul (int valoare1, int valoare2) {
        int rezultat = valoare1 % valoare2;
        return rezultat;
    }

}
