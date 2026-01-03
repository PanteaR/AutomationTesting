package PrincipiileOop;

public abstract class MainColectiiCarti {
    public static void main(String[] args){

        AutoriRomani carte1 = new AutoriRomani("Mihai Eminescu", 30, "A5", "lucioasa");
        AutoriRomani carte2 = new AutoriRomani("Ion Creanga", 45, "A4", "mata");
        AutoriRomani carte3 = new AutoriRomani("Mihai Eminescu", 45, "A4", "lucioasa");
        System.out.println("Ce autor are cartea carte1: " + carte1.getAutor());
        System.out.println("Pe ce raft este cartea carte2: " + carte1.sortareNumarPagini());
    }
}
