package service;

public final class Carte {
    //atribute
    private final String autor;
    private final String titlu;
    private final Tematica tematica;
    private final boolean imprumutata;
    //constructor
    public Carte(String autor, String titlu, Tematica tematica, boolean imprumutata) {
        this.autor = autor;
        this.titlu = titlu;
        this.tematica = tematica;
        this.imprumutata = imprumutata;
    }
    //crearea metodei getter
    public String getAutor() {
        return autor;
    }

    public String getTitlu() {
        return titlu;
    }

    public Tematica getTematica() {
        return tematica;
    }

    public boolean getImprumutata() {
        return imprumutata;
    }

    public void disponibilitateCarte() {
        if (getImprumutata()) {
            System.out.println("Cartea este disponibila.");
        } else {
            System.out.println("Cartea nu este disponibila.");
        }
    }
}
