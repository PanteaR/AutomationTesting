package mosteniri;

public class ExceptiiGenericeUncecked extends RuntimeException {
    public ExceptiiGenericeUncecked (String mesaj){
        super (mesaj);
    }
    public ExceptiiGenericeUncecked(String mesaj, Throwable cause){
        super(mesaj, cause);
    }

}
