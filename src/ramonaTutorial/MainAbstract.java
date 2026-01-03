package ramonaTutorial;

public class MainAbstract {
    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        System.out.println(labrador.rasa);
        System.out.println(labrador.rasa());
        labrador.sunet();
        System.out.println(labrador.returneazaRasa());
    }
}
//        labrador.mananca();
//        labrador.sunet();
//        labrador.reproducere();
//        labrador.vaneaza();
//        System.out.println(labrador.rasa());
//
//
//        Cerc cerc = new Cerc(3.2, 10.1, -5.5);
//        System.out.println(cerc.raza);
//        System.out.println(cerc.x);
//        System.out.println(cerc.y);
//
//        System.out.println(cerc.getX());
//        System.out.println(cerc.getY());
//
//        System.out.println(cerc.aria());
//        System.out.println(cerc.perimetru());
//    }
//}
