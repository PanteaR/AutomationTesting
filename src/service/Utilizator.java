package service;

public class Utilizator {
    //atribute
    private String nume;
    private Integer ID;
//constructir
    public Utilizator(String nume, Integer ID) {
        this.nume = nume;
        this.ID = ID;
    }
//metoda get
    public String getNume() {
        return nume;
    }

    public Integer getID() {
        return ID;
    }
}
