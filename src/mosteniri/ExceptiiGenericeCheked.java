package mosteniri;

public class ExceptiiGenericeCheked extends Exception {
    public ExceptiiGenericeCheked(String mesaj) {
        super(mesaj);
    }
    public ExceptiiGenericeCheked(String mesaj, Throwable cause) {
        super(mesaj, cause);
    }
}
