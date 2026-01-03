package tipuriDeDate;

public class VerificareParitate {
    /*verificati daca un numar este par sau impar si comparati 2 string-uri la alegere.

     */
    public static void main(String[] args) {
        int numar1 = 13;
        boolean verificareParitate = verificareParitate(numar1);
        System.out.println("Este " + numar1 + "par? " + verificareParitate);
    }

    private static boolean verificareParitate (int numar1){
        return numar1%2 == 0;
    }

}
