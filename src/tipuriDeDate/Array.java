package tipuriDeDate;

import java.util.Arrays;

public class Array {
    /* 1. Sa se intializeze un array de zece elemente care sa contina doar numere pare si inca un array care sa contina doar numere impare */
    // 2. Sa se imbine cele doua array-uri sa devina doar unu.
    // Sa se printeze rezultatele folosind functii individuale.
    // 3. Pasati si printati argumentele pe care le primim din args din functia main.
    //arr[i] = (i + 1) *2;
    //arr[i] = (i*2) +1;
    public static void main(String[] args) {
        int[] numerePare = new int[10];
        int[] numereImpare = new int[10];
        int[] numere = new int[numerePare.length + numereImpare.length];

        for (int i = 0; i < numerePare.length; i++) {
            numerePare[i] = (i + 1) * 2;
            numereImpare[i] = (i * 2) + 1;
        }
        for (int i = 0; i < numere.length; i++) {
            if (i < numerePare.length) {
                numere[i] = numerePare[i];
            } else {
                numere[i] = numereImpare[i - numerePare.length];
            }

        }
        System.out.println(Arrays.toString(numere));
        afisareNumerePare(numerePare, numereImpare);
    }
    private static void afisareNumerePare(int[] numerePare, int[] numereImpare) {
        for (int i = 0; i < numerePare.length; i++) {
            System.out.println("Sirul de numere pare este " + numerePare[i]);
        }
         //   for (int i = 0; i < numerePare.length; i++) {
        for (int i = 0; i < numereImpare.length; i++) {
            System.out.println("Sirul de numere impare este " + numereImpare[i]);
            }
        }
    }

