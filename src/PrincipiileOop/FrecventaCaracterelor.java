package PrincipiileOop;

import java.util.HashMap;
import java.util.Map;

public class FrecventaCaracterelor {
    //verificati frecventa caracterelor intr-un string.

    public static void main(String[] args) {

        // 1. initializare string
        // 2. Iterezi prin acel string si stocare valoare/verificare de cate ori se repeta;

        Map<Character, Integer> frecventa = new HashMap<>();
        String propozitie = "ana are mere.";

        for (int i = 0; i < propozitie.length(); i++) {
            char cheia = propozitie.charAt(i);

           if (Character.isLetterOrDigit(cheia)) {

                Integer valoarea = frecventa.getOrDefault(cheia, null);
                if (valoarea == null) {
                    frecventa.put(cheia, 1);
                } else {
                    frecventa.put(cheia, valoarea + 1);
                }
            }
            System.out.println("frecventa caracterelor" + frecventa);
        }
        //In contorizarea frecventei caracterelor, sa se includa doar literele si cifrele
//Character is digi
//Character is letter/
    }
}

