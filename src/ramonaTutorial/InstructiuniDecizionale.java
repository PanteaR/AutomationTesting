package ramonaTutorial;

public class InstructiuniDecizionale {
    public static void main(String[] args) {
//        //instructiunea IF-ELSE - IF
//        //operatorul ternar
        int numar = 42;

        // IF-ELSE
        if(numar < 0) {
            System.out.println("numarul este mai mic decat zero");
        } else {
            System.out.println("Am intrat pe ramura else");
        }

        //operator ternar - se defineste conditita ? instructiunea_true : instructiunea_false
        System.out.println(numar < 0 ? "Instructiunea a fost true" : "Instructiunea a fost falsa");


        System.out.println("Dupa instructiunea IF");

      double nota = 8.5;

        if(nota == 10) {
            System.out.println("Studentul a primit nota maxima");
        } else if(nota==9) {
            System.out.println("Studentul a luat nota 9");
        } else if(nota < 9 && nota > 8){
            System.out.println("Studentul a primit nota intre 8 si 9");
        } else {
            System.out.println("Am executat ramura ELSE");
        }

        String ziua = "luni";
                if(ziua == "sambata") {
                    System.out.println("Azi e sambata");
                } else if (ziua == "duminica") {
                    System.out.println("Azi este duminica");
                } else {
                    System.out.println("A trecut weekendul");

                }
        //Instructiunea SWITCH - tipurile de date acceptate de switch sunt:
        //char, byte, short, int, String
        //!!Nu folosim SWITCH cand avem alta conditie alta decat ==   , exemplu:  else if (ziua.lenght() > 3) {

        switch (ziua) {
            case "sambata" : {
                System.out.println("Ziua sambata - switch");
                break;
            } case "duminica" : {
                System.out.println("Ziua duminica - switch");
                break;
            } default : {
                System.out.println("Nu este weekend - switch");
            }
        }

    }
}
