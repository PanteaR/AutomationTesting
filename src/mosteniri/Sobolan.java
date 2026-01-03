package mosteniri;

import java.io.FileNotFoundException;

public class Sobolan extends AnimalExceptii{
    @Override
    public void conduceMasina() {
        throw new ExceptiiGenericeUncecked("Sobolanii nu pot conduce");
    }

    @Override
    public void vedereNocturna() {
        System.out.println("Sobolanii pot vedea noatea");
    }

    @Override
    public void incarcaParticularitati() throws FileNotFoundException {

    }
}
