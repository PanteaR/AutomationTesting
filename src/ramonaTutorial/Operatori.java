package ramonaTutorial;

public class Operatori {
    public static void main(String[] args) {
        // +, -, *, /
        // %
        System.out.println(6 % 4);

        // ++, --
        int a = 7;
        System.out.println(++a);

        // comparatie intre operanzi
        // <, >, <=, >=, ==

        int c = 8;
        int d = 9;
        System.out.println(c < d);
        boolean var = 10 == 9;
        System.out.println(var);

        // &&, ||
        boolean var2 = (5 == 4) && (5 == 5);
        System.out.println(var2);

        boolean var3 = (5 == 4) || (5 == 5);
        System.out.println(var3);


    }
}
