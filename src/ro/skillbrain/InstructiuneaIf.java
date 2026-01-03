package ro.skillbrain;

import PrincipiileOop.SingleTonExample;

import java.util.Scanner;

public class InstructiuneaIf {
    public static void main(String[] args) {
        Scanner cititor = new Scanner(System.in);
        System.out.println("Introduceti vastra d-voastra:");
        int varstaMea = cititor.nextInt();
        if(varstaMea>=10) {
            System.out.println("esti major");
        }
        else {
            System.out.println("esti minor");
        }
    }

}
