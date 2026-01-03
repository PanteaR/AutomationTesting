package mosteniri;

import enums.Colour;
import enums.Combustibil;

public class Start {
    public static void main(String[] args) {
        Dacia loganBenzina = new Logan("Prestige", 999, Colour.ALB, Combustibil.BENZINA, (short) 2021);
        Dacia loganMotorina = new Logan("Prestige", 1500, Colour.ALB, Combustibil.BENZINA, (short) 2019);

        Dacia springElectric = new Spring("Spring", 12, Colour.FUCSIA, Combustibil.ELECTRIC, (short) 2020);

        System.out.println("Cum porneste Springul electric? " + springElectric.porneste());
        System.out.println("Are Springul electric geamuri electrice spate? " + springElectric.geamuriElectriceSpate());

        System.out.println("Cum porneste Loganul pe benzina? " + loganBenzina.porneste());
        System.out.println("Are Loganul pe benzina geamuri electrce? " + loganBenzina.geamuriElectriceSpate());
    }
}
