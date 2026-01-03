package ramonaTutorial;

public class Labrador extends Metode.Caine {

    public String rasa = "labrador";
    public boolean numarPicioare;
    public boolean getNumarPicioare;

    // definim un atribut pentru care nu definim nici un modificator de acces

    String culoare = "maro";

    public String rasa() {
        return rasa;
    }

    // cream o metoda fara modificator de acces care ne va returna:
String returneazaCuloare(){
        return culoare;
}



    public String returneazaRasa() {
        return rasa();
    }


    @Override
    public void mananca() {
        System.out.println("Eu sunt un labrador si imi place pedigree");

    }

}
