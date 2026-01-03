package mosteniri;

import enums.Colour;
import enums.Combustibil;

public class Logan extends Dacia {
    public Logan(String model, int cc, Colour culoare, Combustibil combustibil, short anFabricatie) {
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
            case BENZINA -> {
                return "vrum vrum vrum";
            }
            case MOTORINA -> {
                return "vrum vrum";
            }
            case GAZ -> {
                return "vrum vrum vrum vrum";
            }
            case ELECTRIC -> {
                throw new IllegalStateException("Nu exista logan electric");
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
            case BENZINA -> {
                return 15000;
            }
            case MOTORINA -> {
                return 30000;
            }
            case ELECTRIC -> {
                return 50000;
            }
            case GAZ -> {
                return 10000;
            }
            default -> {
                throw new IllegalStateException("combustibil inexistent");
            }
        }

    }
}
