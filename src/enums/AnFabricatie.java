package enums;

public enum AnFabricatie {
    doua_mii(2000);
    int an;
//acesta este un constructor
    AnFabricatie(int i) {
        this.an = i;
    }

    public int getAn() {
        return an;
    }
}
