package ro.skillbrain;

public class DoarDeTest {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        System.out.println(a + b);
        String nume = "Pantea ";
        String prenume = "Ramona";
        System.out.println(nume + prenume);

        float x = 2.5f;
        float y = 4.7f;


        System.out.println(x * y);
        /* O metoda cu doua bucle for, una din ele itereaza printr-un array unidemnsional si adauga elemente de la 0 la 10; a doua bucla for ce printeaza elementele din array.*/
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + 1);
        }
    }
}
