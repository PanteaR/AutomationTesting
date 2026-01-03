package mosteniri;

import enums.Colour;
import enums.Combustibil;

public abstract class Masina {

    private String model;
    private int cc;
    private Colour culoare;
    private Combustibil combustibil;
    private short anFabricatie;

    //Creare constructor default -metoda speciale ce are aceeasi denumire cu numele clasei;
    //constructorul are si el un modificator de acces
    //daca definim alt constructor default sau implicit, constructorul implicit este inlocuit;

//    private Masina(){
//    }

    //Daca facem un constructor privat nu poate fi instantiat/accesat din alte clase;


//definim un alt constructor cu toti parametrii

    public Masina(String model, int cc, Colour culoare, Combustibil combustibil, short anFabricatie) {

        this.model = model;
        this.cc = cc;
        this.culoare = culoare;
        this.combustibil = combustibil;
        this.anFabricatie = anFabricatie;
    }

    public Masina(String model, int cc,Colour culoare, short anFabricatie) {
        this(model, 0, culoare, Combustibil.ELECTRIC, anFabricatie);
    }

    protected abstract String porneste();

    protected abstract int intervalKmService();

    public String getModel() {
        return model;
    }

    public int getCc() {
        return cc;
    }

    public Colour getCuloare() {
        return culoare;
    }

    public Combustibil getCombustibil() {
        return combustibil;
    }

    public short getAnFabricatie() {
        return anFabricatie;
    }
}
