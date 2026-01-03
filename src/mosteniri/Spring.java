package mosteniri;

import enums.Colour;
import enums.Combustibil;

public class Spring extends Dacia {
    public Spring(String model, int cc, Colour culoare, Combustibil combustibil, short anFabricatie) {
        super(model, cc, culoare, combustibil, anFabricatie);
    }

    @Override
    public boolean geamuriElectriceSpate() {
        return getAnFabricatie() > 2020;
    }

    @Override
    protected String porneste() {
        Combustibil combustibil = getCombustibil();
        switch (combustibil) {
            case ELECTRIC -> {
                return "Pst";
            }
            case BENZINA -> {
                throw new IllegalStateException("Nu exista Spring benzina");
            }
            case GAZ -> {
                throw new IllegalStateException("Nu exista Spring gaz");
            }
            case MOTORINA -> {
                throw new IllegalStateException("Nu exista Spring motorina");
            }
            default -> {
                throw new IllegalStateException("combustibil inexistent");
            }

        }
    }

    @Override
    protected int intervalKmService() {
        Combustibil combustibil = getCombustibil();
        switch (combustibil) {
            case ELECTRIC -> {
                return 50000;
            }
            case MOTORINA -> {
                return 30000;
            }
            case GAZ -> {
                return 10000;
            }
            case BENZINA -> {
                return 15000;
            }
            default -> {
                throw new IllegalStateException("combustibil inexistent");
            }
        }
    }
}

