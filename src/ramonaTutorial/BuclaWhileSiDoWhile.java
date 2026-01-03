package ramonaTutorial;

import java.util.ArrayList;

public class BuclaWhileSiDoWhile {
    public static void main(String[] args) {

        // ***** diferenta intre while si for este ca la bucla while, variabila trebuie declarata inainte;

//        int i = 0;
//        while (i < 7) {
//            System.out.println("I este egal cu " + i);
//            i++;


//        }
//        double[] numere = {21.4, 43.6, 5, -15.6};
//
//        int i = 0;
//        while (i < numere.length) {
//            System.out.println("Indexul este  " + i + " valoarea este " + numere[i]);
//            i++;
//        }

        //*****In array listuri nu se pot folosi variabile primitive.


        //******exemplu decrementare
//         ArrayList<Double> lista = new ArrayList<>();
//        lista.add(23.4);
//        lista.add(-12.3);
//        lista.add(9d);

//        int j = lista.size() -1;
//        while (j >= 0) {
//            System.out.println("Indexul este " + j + " valoarea este " + lista.get(j));
//            j--;
//
//        }
        //*****exemplu incrementare
//            int j = 0;
//            while (j < lista.size()) {
//            System.out.println("Indexul este " + j + " valoarea este " + lista.get(j));
//            j++;


// suma elementelor dintr-un array si suma elementelor dintr-un arrayList
        double[] numere = {21.4, 43.6, 5, -15.6};
        ArrayList<Double> lista = new ArrayList<>();
        lista.add(23.4);
        lista.add(-12.3);
        lista.add(9d);

        double sumaArray = 0;
        int i = 0;
        do {
            sumaArray = sumaArray + numere[i];
            i++;
        } while (i < numere.length);
        System.out.println("Suma este egala cu: " + sumaArray);
    }
}

//        Integer sumaArrayList = 0;
//        int j = 0;
//        do {
//            sumaArrayList = (int) (sumaArrayList + lista.get(j));
//            j++;
//        } while ( j < lista.size(j));
//        System.out.println("Suma elementelor din ArrayList este: " + sumaArrayList);
//    }




