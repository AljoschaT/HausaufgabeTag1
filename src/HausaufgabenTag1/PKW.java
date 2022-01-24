package HausaufgabenTag1;

public class PKW {

    // Attribute
    public String marke;
    public String modell;
    public int ps;

    // Konstruktoren

    public PKW(String marke, String modell, int ps) {
        this.marke = marke;
        this.modell = modell;
        this.ps = ps;
    }

    // Methoden


    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }
}
