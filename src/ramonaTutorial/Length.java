package ramonaTutorial;

import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String prenume = scanner.nextLine();
        System.out.println("prenumele meu este: " + prenume);

        System.out.println("Aceasta este prima metoda");
        for (int i=0; i < prenume.length(); i++){
            System.out.println("Caractere: " + prenume.charAt(i));
        }
        System.out.println("Aceasta este metoda doi");
        for (char caracter : prenume.toCharArray()){
            System.out.println( "Metoda doi " + caracter);
        }
    }

    public static class ArrayMultidimensional {
        public static void main(String[] args) {

        }
    }
}
