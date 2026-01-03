package PrincipiileOop;
//În primul rând, creăm constructorul privat al clasei singleton care împiedică instanțiarea directă.
//Apoi creați metoda statică numită și metoda getInstance() care returnează o singură instanță a clasei. Acest lucru asigură că singurul obiect este creat utilizând intializarea leneșă
//Stocați instanța în variabila statică privată , care vă asigură că este creată singura instanță.
public class SingleTonExample {
    private SingleTonExample() {//1

    }

    private static SingleTonExample instance = new SingleTonExample();//3

    public static SingleTonExample tanta() {//2
        if (instance != null) {
            return tanta().instance;
        }

        instance = new SingleTonExample();
        return instance;
    }
    public static String adu(String obiect){
        return "Tanta! Adu:  " + obiect;
    }
}