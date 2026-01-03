package mosteniri;

import java.util.ArrayList;
import java.util.List;
//id, model, an, numarKm, optiuni
//sa se creeze o clasa imutabila cu campurile mai sus mentionate
public final class Autoturism {
    private int ID;
    private String model;
    private short anFabricatie;
    private int nrKm;
    private List<String> listaOptiuni;

    public Autoturism (int ID, String model, short anFabricatie, int nrKm, List<String>listaOptiuni){
      this.ID = ID;
      this.model = model;
      this.anFabricatie = anFabricatie;
      this.nrKm = nrKm;
      this.listaOptiuni  = listaOptiuni;

    }
    public int getID() {
        return ID;
    }
    public String getModel(){
        return model;
    }
    public int getanFabricatie(){
        return anFabricatie;
    }
    public int getNrKm(){
        return nrKm;
    }
    public List<String> getlistaOptiuni(){
        return new ArrayList<>(listaOptiuni);
    }

}
