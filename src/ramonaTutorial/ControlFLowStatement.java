package ramonaTutorial;

public class ControlFLowStatement {
    public static void main(String[] args) {
        // if/else, if/then/else, for, while, do/while, switch

        int number = 1;
//        if(number == 1) {
//            System.out.println("Valoarea lui number este 1");
//        }else if(number ==2) {
//            System.out.println("valoarea lui number este 2");
//        } else {
//            System.out.println("Valoarea lui number este diferita de 1");
//        }
        //............................................


//        // ca sa cream o bucla in java
//        for(int i = 0; i<=10; i++){
//            System.out.println(i);
//        }
        //..............................................

//        while(number<10){
//            System.out.println("Number inainte de incrementare");
//            number++;
//            System.out.println("Number dupa incrementare" + number);
//        }
//.................................................
//
//        do {
//            System.out.println("Number inainte de incrementare" + number);
//            number++;
//            System.out.println("Number dupa incrementare" + number);
//        } while (number < 10);

        //.........................................

        switch (number) {
            case 1:
                // aici va fi blocul nostru de cod care se va executa in cazul in are number este 1;
                break;
            case 2:
                //aici se va executa codul pentru cazul ion care number este 2;
                System.out.println("In acest caz number este 2");
                break;
        }
    }
}
