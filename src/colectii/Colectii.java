package colectii;

import java.util.*;

public class Colectii {
    public static void main(String[] args) {

        ArrayList<String> numeCursanti = new ArrayList<>();
        numeCursanti.add("Vali");
        numeCursanti.add("Ramona");
        numeCursanti.add("Daniela");
        numeCursanti.add("Maria");
        numeCursanti.add("Maria");

        for (int i = 0; i < numeCursanti.size(); i++) {
            System.out.println(numeCursanti.get(i));
        }

        for (String nume : numeCursanti) {
            System.out.println(nume);
        }

        HashSet<String> numeUnice = new HashSet<>(numeCursanti);
        Iterator<String> iterator = numeUnice.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
       for (String cursanti : numeUnice){
           System.out.println(cursanti);
       }
        Map<String, Integer> note = new HashMap<>();
        note.put("Ramona", 10);
        note.put("Vali", 10);
        note.put("Denisa", 10);
        note.put("Cosmin", 10);
        note.put("Evelina", 10);
        note.put("Daniela", 10);
        note.put("Alex", 10);
        note.put("Maria", 10);
        note.put("Razvan", 10);
        System.out.println(note);

        System.out.println("Tree map");

        Map<String, Integer> noteTree = new TreeMap<>();
        note.put("Ramona", 10);
        note.put("Vali", 10);
        note.put("Denisa", 10);
        note.put("Cosmin", 10);
        note.put("Evelina", 10);
        note.put("Daniela", 10);
        note.put("Alex", 10);
        note.put("Maria", 10);
        note.put("Razvan", 10);

        System.out.println(note);

        System.out.println(noteTree);

        List<String> valoriArgs = Arrays.asList(args);
        System.out.println(valoriArgs);

    }
}
