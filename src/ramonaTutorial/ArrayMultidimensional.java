package ramonaTutorial;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        String[][] bidimensional = new String[3][6];
        String[][][] tridimensional = new String[2][3][1];

        bidimensional[0][0] = "curs";
        bidimensional[2][1] = "capitol";

        System.out.println(bidimensional[0][0]);
        System.out.println(bidimensional[2][1]);
//        System.out.println(bidimensional[3][6]);

        String[][] multidimensional = {{"laptop", "masa"}, {"tastatura"}};
        System.out.println(multidimensional[0][0]);
        System.out.println(multidimensional[0][1]);
        System.out.println(multidimensional[1][0]);

        //exercitii
        int[][] numereleMele = {{1,2,3,4}, {5,6,7}};
        System.out.println("Cate elemente are matricea?");
        System.out.println(numereleMele[1][2]);

        // poti schimba valoarea elementelor
        int[][] myNumbers = {{1,2,3,4}, {5,6,7}};
        myNumbers[1][2] = 9;
        System.out.println("Se modifica in numarul 9");
        System.out.println(myNumbers[1][2]);

        //se poate folosi for loop in cadrul unui alt for lop ca sa afli
        //elementele unei matrici bidimensionale

        System.out.println("elementele matricei sunt:");
        int[][]numere = {{1,2,3,4}, {5,6,7}};
        for(int i = 0; i < numere.length; i++) {
            for(int j = 0; j < numere[i].length; j++){
                System.out.println(numere[i][j]);
            }

        }

    }
}
