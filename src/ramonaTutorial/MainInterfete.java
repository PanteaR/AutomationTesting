package ramonaTutorial;

public class MainInterfete {
    public static void main(String[] args) {
//cream un obiect de tip Labrador
        Labrador labrador = new Labrador();

//accesam atributul culoare

        System.out.println(labrador.culoare);
//accesam metoda returneazaCuloare
        System.out.println(labrador.returneazaCuloare());


        System.out.println(labrador.numarPicioare);
        System.out.println(labrador.getNumarPicioare);

        Metode.Caine caine = new Metode.Caine();
        caine.mananca();
        caine.sunet();
        caine.reproducere();
        caine.vaneaza();

        System.out.println(caine.inteligenta);
    }

}
