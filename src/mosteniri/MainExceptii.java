package mosteniri;

import java.io.FileNotFoundException;

public class MainExceptii {
    public static void main(String[] args) {
        Persoana persoana = new Persoana();
        persoana.conduceMasina();

        Sobolan sobolan = new Sobolan();
        sobolan.vedereNocturna();
        sobolan.conduceMasina();

       try {
           persoana.incarcaParticularitati();
       } catch (Exception e){
            System.out.println(e.getMessage());
           System.out.println(e.getCause());
       }
        persoana.vedereNocturna();

    }

}
