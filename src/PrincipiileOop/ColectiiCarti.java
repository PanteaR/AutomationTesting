package PrincipiileOop;

public abstract class ColectiiCarti {
    // Sa se creeze 2 obiecte cu diferite proprietati si sa se creeze multiple inserari cu acele obiecte.

// sa se elimine duplicatele din acele liste.

    private String autor;
    private Integer numarPagini;
    private String format;
    private String tipCoperta;

    public ColectiiCarti(String autor, Integer numarPagini, String format, String tipCoperta){
        this.autor = autor;
        this.numarPagini = numarPagini;
        this.format = format;
        this.tipCoperta = tipCoperta;
    }
    protected abstract String sortareNumarPagini();
    public String getAutor() {
        return autor;
    }
    public Integer getNumarPagini() {
        return numarPagini;
    }
    public String getFormat() {
        return format;
    }
    public String getTipCoperta() {
        return tipCoperta;
    }
}




