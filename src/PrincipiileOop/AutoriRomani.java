package PrincipiileOop;

import java.sql.SQLOutput;
class AutoriRomani extends ColectiiCarti{
    public AutoriRomani(String autor, Integer numarPagini, String format, String tipCoperta) {
        super(autor, numarPagini, format, tipCoperta);
    }
    @Override
    protected String sortareNumarPagini() {
        if(getNumarPagini() < 25){
            System.out.println("Cartea este pe raftul 2: ");
        } else {
            System.out.println("Cartea este pe raftul 3");
        }
        return "carte de este de imprumutat";
    }
}

