package ramonaTutorial;

public class Cerc extends ObiectGrafic {
    double raza;

    Cerc(double raza, double x, double y){
        super(x,y); // new ObiectGrafic();
        this.raza = raza;
    }
//    Cerc(){
//
//    }

    public double aria() {
        return Math.PI * raza * raza;
    }

    @Override
    public double perimetru() {
        return 2* Math.PI * raza;
    }
}
