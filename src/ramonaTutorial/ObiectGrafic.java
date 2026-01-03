package ramonaTutorial;

public abstract class ObiectGrafic {
    //atribute
    public double x,y;

    //constructori
    ObiectGrafic(){
        x = 5.3;
        y = -1.5;
    }

    ObiectGrafic(double x, double y){
        this.x = x;
        this.y = y;
    }

    //metode

    public double getX(){
        return x;
    }

    public double getY() {
        return y;
    }

    public abstract double aria();
    public abstract double perimetru();
}
