package tipuriDeDate;

public class MetodaTrei {
    public static void main(String[] args) {
        System.out.println("De la 0 la 100: ");
        int a = 0;
        int b = 100;
        for (int i = 0; i <= 100; i++) {
            System.out.println("Numaratoare: " + i);
        }
        for (int i = 0; i <= 100; i += 2) {
            System.out.println("Numaratoare: " + i);
        }
        for (int i = 100; i >= 0; i--) {
            System.out.println("Numaratoare: " + i);
        }
        for (int i = 100; i >= 0; --i) {
            System.out.println("Numaratoare: " + i);
        }
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }
}