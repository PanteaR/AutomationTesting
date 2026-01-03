package ramonaTutorial;

public class Array_uri {
    public static void main(String[] args) {
        //tip nume

        String[] studenti;
        int numere[];

        studenti = new String[10];
        numere = new int[5];

        double [] duble = new double [7];

        studenti[0] =  "Mihai";
        studenti[1] = "Anamaria";

        System.out.println(studenti[0]);
        System.out.println(studenti[1]);
        System.out.println(studenti[2]);

        System.out.println(numere[1]);

        // Array Literal
        String[] literal = {"Alexandru", "mere", "masa"};
        System.out.println(literal[0]);
        System.out.println(literal[1]);

       // Daca vrei sa afli cate elemente are un array trebuie sa folosesti length
        System.out.println(literal.length);

        // Se pot parcurge elementele matricei cu BUCLA FOR pentru a specifica de cate ori trebuie sa ruleze bucla,
        //, folosind proprietatea length

        for(int i=0; i< literal.length; i++){
            System.out.println(literal[i]);
        }

        System.out.println(literal[5]);

    }

}
