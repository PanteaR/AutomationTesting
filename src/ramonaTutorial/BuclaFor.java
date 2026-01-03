package ramonaTutorial;

import java.util.ArrayList;

public class BuclaFor {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i+=2) {
            System.out.println("Valoarea variabilei i este: " + i);
        }

        int[] numere = {21, 3, 4, 65, 34};
        for( int i = 0; i < numere.length; i++){
        System.out.println("elementul" + i + "este egal cu " + numere[i]);
        }


      //ARRAY LIST
        ArrayList<String> list = new ArrayList<>();

        list.add("mere");
        list.add("pere");
        list.add("prune");
        list.add("lamaie");

        //FOR
        for(int i = 0; i < list.size(); i++) {
            System.out.println("Ellementul la indicele " + i + " este egal cu " + list.get(i));
        }

        //FOR EACH
        for (String element : list) {
            System.out.println(" Valoarea elementului din array list este: " + element);
        }
    }
}
