package mosteniri;

import java.io.FileNotFoundException;

public class Persoana extends AnimalExceptii {
    @Override
    public void conduceMasina() {
        System.out.println("Oamenii pot conduce masina daca au permis de conducere");
    }

    @Override
    public void vedereNocturna() {
        throw new ExceptiiGenericeUncecked("Oamenii nu pot vedea bine pe timpul noptii");
    }

    @Override
    public void incarcaParticularitati() throws FileNotFoundException {
        throw new FileNotFoundException("Fisier negasit");
    }
}
