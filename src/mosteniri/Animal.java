package mosteniri;

import enums.Sunete;

public abstract class Animal {

    private String tipMancare;
    private boolean mamifer;
    private Sunete sunet;
    private String mediuViata;

    public Animal(String tipMancare, boolean mamifer, Sunete sunet, String mediuViata){
 this.tipMancare =tipMancare;
 this.mamifer =mamifer;
 this.mediuViata =mediuViata;
 this.sunet =sunet;

}
public String getMediuViata(){
        return mediuViata;
    }
    public boolean getmamifer(){
        return mamifer;
    }
    public String getTipMancare(){
        return tipMancare;
    }

    public Sunete getSunet() {
        return sunet;
    }
}
