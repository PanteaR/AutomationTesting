package ramonaTutorial;

public class Metode {
    public static void main(String[] args) {
        System.out.println("Printeaza ");

        primaMetoda();
        douaMetoda(6.2);
        System.out.println(treiaMetoda(5));
    }
  // tipul de acces-> tipul returnat, numele metodei(parametri) {
    //
  // }
    static void primaMetoda() {
        System.out.println("Prima mea metoda! ");
    }
    static void douaMetoda(double dublu) {
        double rezultat = dublu * 2;
        System.out.println(rezultat);
    }
    static int treiaMetoda(int intreg) {
        int rezultat = intreg * intreg;
        return rezultat;
    }

    public static class Caine implements Mamifer, AnimalDeCompanie {

        @Override
        public void mananca() {
            System.out.println("Eu sunt un caine si imi place sa mananc oase");

        }

        @Override
        public void sunet() {
            System.out.println("ham ham");

        }

        @Override
        public void reproducere() {
            System.out.println("Eu sunt un caine si imi hranesc puii cu lapte");
        }

        @Override
        public void vaneaza() {
            System.out.println("Eu sunt un caine de companie si nu pot vana");
        }
    }

    public static class Main {
    }
}
