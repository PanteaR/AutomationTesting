package mosteniri;

import enums.Colour;
import enums.Combustibil;

public abstract class Dacia extends Masina {

    public Dacia(String model, int cc, Colour culoare, Combustibil combustibil, short anFabricatie) {
        super(model, cc, culoare, combustibil, anFabricatie);
    }

    public abstract boolean geamuriElectriceSpate();

}
