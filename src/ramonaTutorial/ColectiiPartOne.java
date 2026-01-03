package ramonaTutorial;

import java.util.ArrayList;

public class ColectiiPartOne {
    public static void main(String[] args) {
        String[] studenti = new String[10];
        int[] numere = new int[5];
        studenti[0] = "Mihai";
        studenti[1] = "Alex";
        System.out.println(studenti[0]);
        System.out.println(studenti[1]);
        System.out.println(studenti[2]);
        String[] fructe = {"mere", "pere", "banane"};

        ArrayList<String> lista = new ArrayList<>();
        ArrayList<Integer> inturi = new ArrayList<>();

        lista.add("mere");
        lista.add("pere");
        System.out.println(lista);

        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
//        System.out.println(lista.get(3)); da error out of index

        lista.set(0, "banane");
        System.out.println(lista);

        lista.remove(0);
        System.out.println(lista);
        System.out.println(lista.get(0));

        lista.add("ananas");
        lista.add("avocado");

        System.out.println(lista.size());

        lista.clear();
        System.out.println("Dupa clear");
        System.out.println(lista);
        System.out.println(lista.size());
    }

}
