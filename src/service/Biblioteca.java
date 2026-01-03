package service;

import java.util.*;

public class Biblioteca {
    //Gestionare de bibliotecă
    //Creează o aplicație care gestionează o bibliotecă cu cărți și utilizatori.
    //Exemple a catorva clase: Carte, Utilizator, BIbleoteca
    //Funcționalități:
    //Adăugare/ștergere carte
    //Împrumut/returnare carte
    //Afișarea tuturor cărților împrumutate de un utilizator
    //Folosește: List, Map, Optional, LocalDate
    //Creaza metode pentru a expune functionalitatile mai sus mentionate

    public static void main(String[] args) {
        //aici se creaza obiectele de tip Carte
        Carte carteMijloaceDeTransport = new Carte("Ioana M.", "Masini", Tematica.MijloaceDeTransport, false);
        Carte carteAnimale = new Carte("Raspundel", "Animale domestice", Tematica.Animale, false);
        Carte cartePovesti = new Carte("Ion Creanga", "La scaldat", Tematica.Povesti, true);
        Carte cartePoezii = new Carte("Tudor Arghezi", "Zdreanta", Tematica.Poezii, true);

        System.out.println("Cartea " + carteMijloaceDeTransport.getTitlu() + " este imprumutata? " + carteMijloaceDeTransport.getImprumutata());
        System.out.println("Cartea " + carteAnimale.getTitlu() + " este imprumutata? " + carteAnimale.getImprumutata());
        System.out.println("Cartea " + cartePovesti.getTitlu() + " este imprumutata? " + cartePovesti.getImprumutata());
        System.out.println("Cartea " + cartePoezii.getTitlu() + " este imprumutata? " + cartePoezii.getImprumutata());

        // se gestioneaza o lista de carti cu ArrayList si se adauga cartile in biblioteca
        List<Carte> listaCarti = new ArrayList<>();
        listaCarti.add(carteMijloaceDeTransport);
        listaCarti.add(cartePovesti);
        listaCarti.add(cartePoezii);
        listaCarti.add(carteAnimale);

        //printam cartile adaugate
        System.out.println("Carte adaugata: " + carteAnimale.getTematica());
        System.out.println("Carte adaugata " + cartePoezii.getTematica());
        System.out.println("Carte adaugata " + cartePovesti.getTematica());
        System.out.println("Carte adaugata " + carteMijloaceDeTransport.getTematica());

        //stergem o carte
        listaCarti.remove(carteAnimale);
        System.out.println("Cartea " + carteAnimale.getTitlu() + " a fost stearsa.");

        //pentru a tine evidenta imprumuturilor folosim colectia Map de tip cheie-valoare
        //cheia este utilizatorul, iar valoarea este lista de carti imprumutate de utilizator
        Map<Utilizator, List<Carte>> imprumut = new HashMap<>();

        //creare obiect de tip utilizator
        Utilizator utilizator1 = new Utilizator("Evelina", 12345);
        Utilizator utilizator2 = new Utilizator("Andrei", 67890);

        // Adaugam metode pentru - imprumut carti
        imprumutaCarte(imprumut, utilizator1, carteMijloaceDeTransport);
        imprumutaCarte(imprumut, utilizator1, carteAnimale);
        imprumutaCarte(imprumut, utilizator2, carteAnimale);

    }
    //metoda adaugata pentru pentru imprumut
    public static void imprumutaCarte(Map<Utilizator, List<Carte>> imprumuturi, Utilizator utilizator1, Carte carte) {
        imprumuturi.putIfAbsent(utilizator1, new ArrayList<>());
        imprumuturi.get(utilizator1).add(carte);
        System.out.println("Cartea '" + carte.getTitlu() + "' a fost împrumutată de " + utilizator1.getNume() + ".");
    }
}

